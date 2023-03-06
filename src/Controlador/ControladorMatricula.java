package Controlador;

import static Controlador.ControladorLogin.encontrar;
import static Controlador.ControladorLogin.usuario;
import Modelo.Administrador;
import Modelo.Curso;
import Modelo.Estudiante;
import Modelo.ModeloAdministrador;
import Modelo.ModeloCurso;
import Modelo.ModeloEstudiante;
import Modelo.ModeloMatricula;
import Vista.VistaMatricula;
import Vista.VistaPrincipal;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;

public class ControladorMatricula {

    ModeloMatricula modelo;
    VistaMatricula vista;

    VistaPrincipal p = new VistaPrincipal();

    public ControladorMatricula(ModeloMatricula modelo, VistaMatricula vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        vista.setSize(p.getEscritorioPrincipal().getWidth(), p.getEscritorioPrincipal().getHeight());
        bloquearCamposDeAdministradorYQuitarvisibilidad();
    }

    public void iniciarControl() {
        vista.getBtnMatricular().addActionListener(l -> abrirjDialogMatricula());
        vista.getBtnBuscarEstudiante().addActionListener(l -> abrirjDialogEstudiante());
        vista.getBtnCargarEst().addActionListener(l -> cargarDatosEstudianteEnTXT());

        vista.getBtnBuscarCurso().addActionListener(l -> abrirjDialogCurso());
        vista.getBtnCargarCur().addActionListener(l -> cargarDatosCursoEnTXT());

        cargarDatosAdministradorEnTxt();
    }

    //Matricula
    public void abrirjDialogMatricula() {
        vista.getjDlgMatricula().setLocationRelativeTo(null);
        vista.getjDlgMatricula().setSize(1202, 464);
        vista.getjDlgMatricula().setTitle("Registrar matricula");
        vista.getjDlgMatricula().setVisible(true);
    }

    //Todo sobre estudiante
    public void abrirjDialogEstudiante() {
        vista.getjDlgBuscarEstudiante().setLocationRelativeTo(null);
        vista.getjDlgBuscarEstudiante().setSize(701, 407);
        vista.getjDlgBuscarEstudiante().setTitle("Seleccione un estudiante");
        vista.getjDlgBuscarEstudiante().setVisible(true);
        cargarRegistroDeEstudiantes();
        buscarEstudiante();
    }

    public void cargarRegistroDeEstudiantes() {

        ModeloEstudiante modeloEstudiante = new ModeloEstudiante();

        DefaultTableModel tabla = (DefaultTableModel) vista.getTblDlgEstudiantes().getModel();
        tabla.setNumRows(0);

        List<Estudiante> docentes = modeloEstudiante.listaEstudiantesTabla();
        docentes.stream().forEach(p -> {
            String[] datos = {p.getPer_cedula(), p.getPer_primernom(), p.getPer_apellidopater(), p.getPer_telefono(), p.getPer_email()};
            tabla.addRow(datos);
        });
    }

    public void cargarDatosEstudianteEnTXT() {
        int fila = vista.getTblDlgEstudiantes().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            ModeloEstudiante modeloEstudiante = new ModeloEstudiante();
            List<Estudiante> listap = modeloEstudiante.listaEstudiantesTabla();

            listap.stream().forEach(persona -> {

                if (persona.getPer_cedula().equals(vista.getTblDlgEstudiantes().getValueAt(fila, 0).toString())) {

                    vista.getTxtCodigoEstudiante().setText(String.valueOf(persona.getEst_codigo()));
                    vista.getTxtCedulaEstudiante().setText(persona.getPer_cedula());
                    vista.getTxtNombreYApellidoEstudiante().setText(persona.getPer_primernom() + " " + persona.getPer_apellidopater());

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

                DefaultTableModel tabla = (DefaultTableModel) vista.getTblDlgEstudiantes().getModel();
                tabla.setNumRows(0);

                List<Estudiante> estudiantes = modeloEstudiante.buscarEstudiante(vista.getTxtBuscarEst().getText());
                estudiantes.stream().forEach(p -> {
                    String[] datos = {p.getPer_cedula(), p.getPer_primernom(), p.getPer_apellidopater(), p.getPer_telefono(), p.getPer_email()};
                    tabla.addRow(datos);
                });
            }
        };

        vista.getTxtBuscarEst().addKeyListener(eventoTeclado); //"addKeyListener" es un metodo que se le tiene que pasar como argumento un objeto de tipo keyListener 
    }

    //Todo sobre curso
    public void abrirjDialogCurso() {
        vista.getjDlgBuscarCurso().setLocationRelativeTo(null);
        vista.getjDlgBuscarCurso().setSize(576, 414);
        vista.getjDlgBuscarCurso().setTitle("Seleccione un curso");
        vista.getjDlgBuscarCurso().setVisible(true);
        cargarRegistroDeCursos();
        buscarCurso();
    }

    public void cargarRegistroDeCursos() {

        ModeloCurso modeloCurso = new ModeloCurso();
        vista.getTblDlgjCurso().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblDlgjCurso().getModel();
        estructuraTabla.setRowCount(0);

        List<Curso> listap = modeloCurso.listaCursoTabla();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(c -> {

            estructuraTabla.addRow(new Object[8]);

            vista.getTblDlgjCurso().setValueAt(c.getCur_codigo(), i.value, 0);
            vista.getTblDlgjCurso().setValueAt(c.getCur_nombre(), i.value, 1);
            vista.getTblDlgjCurso().setValueAt(c.getCur_periodo(), i.value, 2);

            i.value++;
        });
    }

    public void cargarDatosCursoEnTXT() {
        int fila = vista.getTblDlgjCurso().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            //Quito la visibilidad del txt del codigo del curso
            //vista.getTxtCodigoCurso().setVisible(false);
            ModeloCurso modeloCurso = new ModeloCurso();
            List<Curso> listap = modeloCurso.listaCursoTabla();

            listap.stream().forEach(c -> {

                if (c.getCur_codigo() == Integer.parseInt(vista.getTblDlgjCurso().getValueAt(fila, 0).toString())) {

                    vista.getTxtCodigoCurso().setText(String.valueOf(c.getCur_codigo()));
                    vista.getTxtNombreCurso().setText(c.getCur_nombre());

                }
            });

            vista.getjDlgBuscarCurso().dispose();
        }
    }

    public void buscarCurso() {

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

                ModeloCurso modeloCurso = new ModeloCurso();
                vista.getTblDlgjCurso().setRowHeight(25);
                DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblDlgjCurso().getModel();
                estructuraTabla.setRowCount(0);

                List<Curso> listap = modeloCurso.buscarCurso(vista.getTxtBuscarCur().getText());

                Holder<Integer> i = new Holder<>(0);

                listap.stream().forEach(c -> {

                    estructuraTabla.addRow(new Object[8]);

                    vista.getTblDlgjCurso().setValueAt(c.getCur_codigo(), i.value, 0);
                    vista.getTblDlgjCurso().setValueAt(c.getCur_nombre(), i.value, 1);
                    vista.getTblDlgjCurso().setValueAt(c.getCur_periodo(), i.value, 2);

                    i.value++;
                });
            }
        };

        vista.getTxtBuscarCur().addKeyListener(eventoTeclado); //"addKeyListener" es un metodo que se le tiene que pasar como argumento un objeto de tipo keyListener 
    }

    //Todo sobre Administrador
    public void cargarDatosAdministradorEnTxt() {
        ModeloAdministrador modeloAdministrador = new ModeloAdministrador();
        List<Administrador> listAdmin = modeloAdministrador.listaAdministradoresTabla();

        listAdmin.stream().forEach(a -> {

            if ((usuario).equals(a.getAdm_usuario())) {

                vista.getTxtCodigoAdministrador().setText(String.valueOf(a.getAdm_codigo()));
                vista.getTxtCedulaAdministrador().setText(a.getPer_cedula());
                vista.getTxtNombreYApellidoAdministrador().setText(a.getPer_primernom() + " " + a.getPer_apellidopater());
            }
        });
    }

    public void bloquearCamposDeAdministradorYQuitarvisibilidad() {
        vista.getTxtCodigoAdministrador().setEditable(false);
        vista.getTxtCedulaAdministrador().setEditable(false);
        vista.getTxtNombreYApellidoAdministrador().setEditable(false);
        vista.getTxtCodigoEstudiante().setVisible(false);
        vista.getTxtCodigoCurso().setVisible(false);
        vista.getTxtCodigoAdministrador().setVisible(false);
    }
}
