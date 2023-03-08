package Controlador;

import Modelo.Estudiante;
import Modelo.ModeloEstudiante;
import Modelo.ModeloReserva;
import Modelo.ModeloSetGrab;
import Modelo.Reserva;
import Modelo.SetGrabacion;
import Vista.VistaPrincipal;
import Vista.VistaReserva;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.xml.ws.Holder;

public class ControladorReserva {

    ModeloReserva modelo;
    VistaReserva vista;

    static boolean verificarReserva;

    VistaPrincipal p = new VistaPrincipal();

    public ControladorReserva(ModeloReserva modelo, VistaReserva vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setSize(p.getEscritorioPrincipal().getWidth(), p.getEscritorioPrincipal().getHeight());
        vista.setVisible(true);
        cargarFechaActual();
        cargarTablaReservas();
    }

    public void iniciarControl() {

        vista.getBtnReservar().addActionListener(l -> abrirjDialogReserva());
        vista.getBtnBuscarEstudiante().addActionListener(l -> abrirjDialogEstudiante());
        vista.getBtnCargarEstudiante().addActionListener(l -> cargarDatosEstudianteEnTXT());
        vista.getBtnBuscarSet().addActionListener(l -> abrirjDialogSet());
        vista.getBtnCargarSet().addActionListener(l -> cargarDatosSetEnTXT());
        vista.getBtnGuardar().addActionListener(l -> crearModificarReserva());
        vista.getBtnModificar().addActionListener(l -> cargarDatosReservaEnTXT());
        vista.getBtnEliminar().addActionListener(l -> eliminarAsignacion());
        buscarRegistros();
    }

    public void cargarTablaReservas() {

        System.out.println("Entra a");
        DefaultTableModel tabla = (DefaultTableModel) vista.getTblReserva().getModel();
        tabla.setNumRows(0);

        ModeloEstudiante modeloEstudiante = new ModeloEstudiante();
        ModeloSetGrab modeloSetGrab = new ModeloSetGrab();

        List<Reserva> reservas = modelo.listaReservasTabla();
        List<Estudiante> estudiantes = modeloEstudiante.listaEstudiantesTabla();
        List<SetGrabacion> setsgrabacion = modeloSetGrab.listaSetGrabTabla();

        reservas.stream().forEach(as -> {
            System.out.println("Codigo docEstudiante : " + as.getRes_codestudiante());

            estudiantes.stream().forEach(d -> {

                if (as.getRes_codestudiante() == d.getEst_codigo()) {

                    System.out.println("Codigo docestudiante : " + as.getRes_codestudiante());
                    System.out.println("Codigo estudiante : " + d.getEst_codigo());

                    setsgrabacion.stream().forEach(a -> {

                        if (as.getRes_codset() == a.getSet_codigo()) {

                            String[] datos = {String.valueOf(as.getRes_codigo()), String.valueOf(d.getEst_codigo()), d.getPer_cedula(), d.getPer_primernom() + " " + d.getPer_apellidopater(), String.valueOf(a.getSet_codigo()), String.valueOf(a.getSet_nombre())};
                            tabla.addRow(datos);

                        }
                    });
                }
            });
        });
    }

    public void abrirjDialogReserva() {
        vista.getjDlgReserva().setLocationRelativeTo(null);
        vista.getjDlgReserva().setSize(885, 433);
        vista.getjDlgReserva().setTitle("Realizar reserva");
        vista.getjDlgReserva().setName("Realizar reserva");
        vista.getjDlgReserva().setVisible(true);
        vista.getTxtCodigoEstudiante().setVisible(false);
        vista.getTxtCodigoSet().setVisible(false);
        limpiarCampos();
        bloquearCampos();
        cargarFechaActual();
    }

    //Todo sobre el registro de Estudiantes en el jDialog
    public void abrirjDialogEstudiante() {
        vista.getjDlgBuscarEstudiante().setLocationRelativeTo(null);
        vista.getjDlgBuscarEstudiante().setSize(685, 418);
        vista.getjDlgBuscarEstudiante().setTitle("Seleccione un estudiante");
        vista.getjDlgBuscarEstudiante().setVisible(true);
        cargarRegistroDeEstudiantes();
        buscarEstudiante();
    }

    public void crearModificarReserva() {
        if ("Crear reserva".equals(vista.getjDlgReserva().getName())) 
        {
            verificarReserva = false;
            //INSERTAR
            if (validarDatos()) {
                List<Reserva> reservas = modelo.listaReservasTabla();
                reservas.stream().forEach(as -> {

                    if (as.getRes_codestudiante() == Integer.parseInt(vista.getTxtCodigoEstudiante().getText())) 
                    {
                        if (as.getRes_codset() == Integer.parseInt(vista.getTxtCodigoSet().getText())) 
                        {
                                /*AQUÍ HACE FALTA LA COMPARACIÓN DE QUE UN SET NO SE PUEDA RESERVAR EN LA FECHA QUE YA ESTABA RESERVADO*/
                                verificarReserva = true;
                        }
                    }
                });

                if (verificarReserva) {
                    JOptionPane.showMessageDialog(vista, "El estudiante ya ha hecho una reserva de éste set EN ÉSTA FECHA");
                } 
                else 
                {
                    modelo.setRes_codestudiante(Integer.parseInt(vista.getTxtCodigoEstudiante().getText()));
                    modelo.setRes_codset(Integer.parseInt(vista.getTxtCodigoSet().getText()));

                    Date fechareserva = vista.getFechaDeReserva().getDate();
                    java.sql.Date fechaSQL = new java.sql.Date(fechareserva.getTime());
                    modelo.setRes_fechareser(fechaSQL);
                    
                    Date fechaentra = vista.getFechaDeEntrada().getDate();
                    java.sql.Date fechaentraSQL = new java.sql.Date(fechaentra.getTime());
                    modelo.setRes_fechaentra(fechaentraSQL);
                    
                    Date fechasale = vista.getFechaDeSalida().getDate();
                    java.sql.Date fechasaleSQL = new java.sql.Date(fechasale.getTime());
                    modelo.setRes_fechasali(fechasaleSQL);

                    if (modelo.insertarReserva() == null) 
                    {
                        JOptionPane.showMessageDialog(vista, "La reserva se ha realizado satisfactoriamente");
                        vista.getjDlgReserva().setVisible(false);
                        cargarTablaReservas();
                    } else {
                        JOptionPane.showMessageDialog(vista, "No se pudo realizar la reserva");
                    }
                }
            }
        } 
        else 
        {
            //EDITAR
            verificarReserva = false;
            if (validarDatos()) 
            {
                List<Reserva> reservas = modelo.listaReservasTabla();
                reservas.stream().forEach(as -> {

                    if (as.getRes_codestudiante() == Integer.parseInt(vista.getTxtCodigoEstudiante().getText())) {
                        if (as.getRes_codset() == Integer.parseInt(vista.getTxtCodigoSet().getText())) {
                            verificarReserva = true;
                        }
                    }
                });

                //Si el alumno ya imparte la materia solo se modificara la fecha
                if (verificarReserva) {

                    modelo.setRes_codigo(codigoReserva);
                    Date fecha = vista.getFechaDeReserva().getDate();
                    java.sql.Date fechaSQL = new java.sql.Date(fecha.getTime());
                    modelo.setRes_fechareser(fechaSQL);
                    
                    Date fechaentra = vista.getFechaDeEntrada().getDate();
                    java.sql.Date fechaentraSQL = new java.sql.Date(fechaentra.getTime());
                    modelo.setRes_fechaentra(fechaentraSQL);
                    
                    Date fechasale = vista.getFechaDeSalida().getDate();
                    java.sql.Date fechasaleSQL = new java.sql.Date(fechasale.getTime());
                    modelo.setRes_fechasali(fechasaleSQL);

                    if (modelo.modificarReserva() == null) {
                        JOptionPane.showMessageDialog(vista, "Los datos de la reserva fueron modificados satisfactoriamente 1");
                        vista.getjDlgReserva().setVisible(false);
                        cargarTablaReservas();
                    }
                } else 
                {
                    modelo.setRes_codigo(codigoReserva);
                    modelo.setRes_codestudiante(Integer.parseInt(vista.getTxtCodigoEstudiante().getText()));
                    modelo.setRes_codset(Integer.parseInt(vista.getTxtCodigoSet().getText()));

                    Date fechareserva = vista.getFechaDeReserva().getDate();
                    java.sql.Date fechaSQL = new java.sql.Date(fechareserva.getTime());
                    modelo.setRes_fechareser(fechaSQL);
                    
                    Date fechaentra = vista.getFechaDeEntrada().getDate();
                    java.sql.Date fechaentraSQL = new java.sql.Date(fechaentra.getTime());
                    modelo.setRes_fechaentra(fechaentraSQL);
                    
                    Date fechasale = vista.getFechaDeSalida().getDate();
                    java.sql.Date fechasaleSQL = new java.sql.Date(fechasale.getTime());
                    modelo.setRes_fechasali(fechasaleSQL);

                    if (modelo.modificarReserva() == null) 
                    {
                        JOptionPane.showMessageDialog(vista, "Los datos de la RESERVA fueron modificados satisfactoriamente");
                        vista.getjDlgReserva().setVisible(false);
                        cargarTablaReservas();
                    } else 
                    {
                        JOptionPane.showMessageDialog(vista, "Los datos no pudieron ser modificados");
                    }
                }
            }
        }
    }

    int codigoReserva;

    public void cargarDatosReservaEnTXT() {
        int fila = vista.getTblReserva().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            vista.getjDlgReserva().setName("Modificar curso");
            vista.getjDlgReserva().setLocationRelativeTo(null);
            vista.getjDlgReserva().setSize(885, 433);
            vista.getjDlgReserva().setTitle("Modificar  curso");
            vista.getjDlgReserva().setVisible(true);
            vista.getTxtCodigoEstudiante().setVisible(false);
            vista.getTxtCodigoSet().setVisible(false);

            ModeloEstudiante modeloEstudiante = new ModeloEstudiante();
            ModeloSetGrab modeloSetGrab = new ModeloSetGrab();

            List<Reserva> reservas = modelo.listaReservasTabla();
            List<Estudiante> estudiantes = modeloEstudiante.listaEstudiantesTabla();
            List<SetGrabacion> setsgrabacion = modeloSetGrab.listaSetGrabTabla();

            reservas.stream().forEach(res -> {

                if (Integer.parseInt(vista.getTblReserva().getValueAt(fila, 0).toString()) == res.getRes_codigo()) {

                    codigoReserva = Integer.parseInt(vista.getTblReserva().getValueAt(fila, 0).toString());

                    estudiantes.stream().forEach(d -> {

                        if (res.getRes_codestudiante() == d.getEst_codigo()) {

                            setsgrabacion.stream().forEach(a -> {

                                if (res.getRes_codset() == a.getSet_codigo()) {
                                    vista.getTxtCodigoEstudiante().setText(String.valueOf(d.getEst_codigo()));
                                    vista.getTxtCedula().setText(d.getPer_cedula());
                                    vista.getTxtNombreEstudiante().setText(d.getPer_primernom());
                                    vista.getTxtApellido().setText(d.getPer_apellidopater());
                                    vista.getTxtAreaEspecificacion().setText(res.getRes_especificacion());
                                    vista.getTxtCodigoSet().setText(String.valueOf(a.getSet_codigo()));
                                    vista.getTxtNombreSet().setText(a.getSet_nombre());
                                    vista.getFechaDeReserva().setDate(res.getRes_fechareser());
                                    vista.getFechaDeEntrada().setDate(res.getRes_fechaentra());
                                    vista.getFechaDeSalida().setDate(res.getRes_fechasali());

                                }
                            });
                        }
                    });
                }
            });
        }
    }

    public void eliminarAsignacion() {
        int fila = vista.getTblReserva().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            int response = JOptionPane.showConfirmDialog(vista, "¿Seguro que desea eliminar esta información?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {

                int codigo;
                codigo = Integer.parseInt(vista.getTblReserva().getValueAt(fila, 0).toString());

                if (modelo.eliminarReserva(codigo) == null) {
                    JOptionPane.showMessageDialog(null, "El registro fue eliminado exitosamente");
                    cargarTablaReservas();//Actualizo la tabla con los datos
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Los datos no fueron eliminados");
                }
            }
        }
    }

    public void buscarRegistros() {

        KeyListener eventoTeclado = new KeyListener() {//Crear un objeto de tipo keyListener(Es una interface) por lo tanto se debe implementar sus metodos abstractos

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {

                //CODIGO PARA FILTRAR LOS DATOS DIRECTAMENTE DE LA TABLA. NO ELIMINAR. SI FUNCIONA. ES MUY IMPORTANTE
                TableRowSorter<DefaultTableModel> filtrar;

                DefaultTableModel tabla = (DefaultTableModel) vista.getTblReserva().getModel();

                //vista.getTablaconduccion().setAutoCreateRowSorter(true);
                filtrar = new TableRowSorter<>(tabla);
                vista.getTblReserva().setRowSorter(filtrar);

                try {

                    filtrar.setRowFilter(RowFilter.regexFilter(vista.getTxtBuscar().getText())); //Se pasa como parametro el campo de donde se va a obtener la informacion y el (3) es la columna con la cual va a buscar las coincidencias
                } catch (Exception ex) {
                    System.out.println("Error: " + ex);
                }
            }
        };

        vista.getTxtBuscar().addKeyListener(eventoTeclado); //"addKeyListener" es un metodo que se le tiene que pasar como argumento un objeto de tipo keyListener 
    }

    //Todo sobre los registros de docentes
    public void cargarRegistroDeEstudiantes() {

        ModeloEstudiante modeloEstudiante = new ModeloEstudiante();

        vista.getTblDlgEstudiante().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblDlgEstudiante().getModel();
        estructuraTabla.setRowCount(0);

        List<Estudiante> listap = modeloEstudiante.listaEstudiantesTabla();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(c -> {

            estructuraTabla.addRow(new Object[3]);

            vista.getTblDlgEstudiante().setValueAt(c.getPer_cedula(), i.value, 0);
            vista.getTblDlgEstudiante().setValueAt(c.getPer_primernom(), i.value, 1);
            vista.getTblDlgEstudiante().setValueAt(c.getPer_apellidopater(), i.value, 2);

            i.value++;
        });
    }

    public void cargarDatosEstudianteEnTXT() {
        int fila = vista.getTblDlgEstudiante().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            ModeloEstudiante modeloEstudiante = new ModeloEstudiante();
            List<Estudiante> listap = modeloEstudiante.listaEstudiantesTabla();

            listap.stream().forEach(c -> {

                if (c.getPer_cedula().equals(vista.getTblDlgEstudiante().getValueAt(fila, 0).toString())) {

                    vista.getTxtCodigoEstudiante().setText(String.valueOf(c.getEst_codigo()));
                    vista.getTxtCedula().setText(c.getPer_cedula());
                    vista.getTxtNombreEstudiante().setText(c.getPer_primernom());
                    vista.getTxtApellido().setText(c.getPer_apellidopater());
                }
            });

            vista.getjDlgBuscarEstudiante().dispose();
        }
    }

    public void buscarEstudiante() {

        KeyListener eventoTeclado = new KeyListener() {//Crear un objeto de tipo keyListener(Es una interface) por lo tanto se debe implementar sus metodos abstractos

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {

                ModeloEstudiante modeloEstudiante = new ModeloEstudiante();
                vista.getTblDlgEstudiante().setRowHeight(25);
                DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblDlgEstudiante().getModel();
                estructuraTabla.setRowCount(0);

                List<Estudiante> listap = modeloEstudiante.buscarEstudiante(vista.getTxtBuscarEstudiante().getText());

                Holder<Integer> i = new Holder<>(0);

                listap.stream().forEach(c -> {

                    estructuraTabla.addRow(new Object[3]);

                    vista.getTblDlgEstudiante().setValueAt(c.getPer_cedula(), i.value, 0);
                    vista.getTblDlgEstudiante().setValueAt(c.getPer_primernom(), i.value, 1);
                    vista.getTblDlgEstudiante().setValueAt(c.getPer_apellidopater(), i.value, 2);
                    i.value++;
                });
            }
        };

        vista.getTxtBuscarEstudiante().addKeyListener(eventoTeclado); //"addKeyListener" es un metodo que se le tiene que pasar como argumento un objeto de tipo keyListener 
    }

    //Todo sobre el registro de asignatura en el jDialog
    public void abrirjDialogSet() {
        vista.getjDlgBuscarSet().setLocationRelativeTo(null);
        vista.getjDlgBuscarSet().setSize(619, 435);
        vista.getjDlgBuscarSet().setTitle("Seleccione un set de grabación");
        vista.getjDlgBuscarSet().setVisible(true);
        cargarRegistroDeSet();
        buscarSet();
    }

    public void cargarRegistroDeSet() {

        ModeloSetGrab modeloSetgrab = new ModeloSetGrab();

        vista.getTblDlgjSet().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblDlgjSet().getModel();
        estructuraTabla.setRowCount(0);

        List<SetGrabacion> listap = modeloSetgrab.listaSetGrabTabla();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(c -> {

            estructuraTabla.addRow(new Object[2]);

            vista.getTblDlgjSet().setValueAt(c.getSet_codigo(), i.value, 0);
            vista.getTblDlgjSet().setValueAt(c.getSet_nombre(), i.value, 1);
            i.value++;
        });
    }

    public void cargarDatosSetEnTXT() {
        int fila = vista.getTblDlgjSet().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            ModeloSetGrab modeloSetgrab = new ModeloSetGrab();
            List<SetGrabacion> listap = modeloSetgrab.listaSetGrabTabla();

            listap.stream().forEach(c -> {

                if (c.getSet_codigo() == Integer.parseInt(vista.getTblDlgjSet().getValueAt(fila, 0).toString())) {

                    vista.getTxtCodigoSet().setText(String.valueOf(c.getSet_codigo()));
                    vista.getTxtNombreSet().setText(c.getSet_nombre());
                }
            });

            vista.getjDlgBuscarSet().dispose();
        }
    }

    public void buscarSet() {

        KeyListener eventoTeclado = new KeyListener() {//Crear un objeto de tipo keyListener(Es una interface) por lo tanto se debe implementar sus metodos abstractos

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {

                ModeloSetGrab modeloSetgrab = new ModeloSetGrab();
                vista.getTblDlgjSet().setRowHeight(25);
                DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblDlgjSet().getModel();
                estructuraTabla.setRowCount(0);

                List<SetGrabacion> listap = modeloSetgrab.buscarSetGrabacion(vista.getTxtBuscarSet().getText());

                Holder<Integer> i = new Holder<>(0);

                listap.stream().forEach(c -> {

                    estructuraTabla.addRow(new Object[3]);

                    vista.getTblDlgjSet().setValueAt(c.getSet_codigo(), i.value, 0);
                    vista.getTblDlgjSet().setValueAt(c.getSet_nombre(), i.value, 1);
                    vista.getTblDlgjSet().setValueAt(c.getSet_ubicacion(), i.value, 2);
                    i.value++;
                });
            }
        };

        vista.getTxtBuscarSet().addKeyListener(eventoTeclado); //"addKeyListener" es un metodo que se le tiene que pasar como argumento un objeto de tipo keyListener 
    }

    public boolean validarDatos() {

        boolean validar = true;

        if (vista.getTxtCedula().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un estudiante");
            validar = false;
        }

        if (vista.getTxtNombreSet().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un set de grabación");
            validar = false;
        }

        if (vista.getFechaDeEntrada().getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha de entrada");
            validar = false;
        } 
        
        if (vista.getFechaDeSalida().getDate() == null) {
            JOptionPane.showMessageDialog(null, "Ingrese una fecha de salida");
            validar = false;
        } 
        else {

            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");//Doy formato a la fecha
            String fechaEntradaT = formato.format(vista.getFechaDeEntrada().getDate()); //Paso de la fecha de contratacion de tipo de Date a String con el formato especificado

            Date fechaConD = null;
            try {
                fechaConD = formato.parse(fechaEntradaT); //Paso la fecha de contratacion de String a Date

            } catch (ParseException ex) {
                Logger.getLogger(ControladorReserva.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        return validar;
    }

    public void bloquearCampos() {
        vista.getTxtCedula().setEditable(false);
        vista.getTxtNombreEstudiante().setEditable(false);
        vista.getTxtApellido().setEditable(false);
        vista.getTxtNombreSet().setEditable(false);
    }

    public void limpiarCampos() {
        vista.getTxtCedula().setText("");
        vista.getTxtNombreEstudiante().setText("");
        vista.getTxtApellido().setText("");
        vista.getTxtAreaEspecificacion().setText("");
        vista.getTxtNombreSet().setText("");
        vista.getFechaDeEntrada().setDate(null);
        vista.getFechaDeSalida().setDate(null);
    }

    
    public void cargarFechaActual() {
        vista.getFechaDeReserva().setEnabled(false);

        //Seteo la fecha actual en el jCalendar
        Date fecha = new Date();
        vista.getFechaDeReserva().setDate(fecha);
    }
}
