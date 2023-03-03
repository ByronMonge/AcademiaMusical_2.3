/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;


import Modelo.ModeloSetGrab;
import Modelo.SetGrabacion;
import Vista.VistaInstrumento;
import Vista.VistaSetGrab;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ControladorSetGrabacion {
    ModeloSetGrab modelo;
    VistaSetGrab vista;

    public ControladorSetGrabacion(ModeloSetGrab modelo, VistaSetGrab vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        vista.getjDlgSetGrab().setResizable(false);
        cargarTablaDeSetGrab();
    }

    public void iniciarControl() {
        vista.getBtnCrear().addActionListener(l -> abrirDialogCrear());
        vista.getBtnGuardar().addActionListener(l -> crearEditarSetGrab());
        vista.getBtnActualizar().addActionListener(l -> cargarTablaDeSetGrab());
        vista.getBtnModificar().addActionListener(l -> cargarDatosInstrumentoEnTXT());
        vista.getBtnEliminar().addActionListener(l -> eliminarInstrumento());
        buscarInstrumento();
    }

    public void abrirDialogCrear() {
        vista.getjDlgSetGrab().setName("Crear nuevo instrumento");
        vista.getjDlgSetGrab().setLocationRelativeTo(vista);
        vista.getjDlgSetGrab().setSize(761, 671);
        vista.getjDlgSetGrab().setTitle("Crear nuevo set de grabacion");
        vista.getjDlgSetGrab().setVisible(true);

        //Limpiar los datos del jDialog
        limpiarDatos();
    }

    public void cargarTablaDeSetGrab() {
        DefaultTableModel tabla = (DefaultTableModel) vista.getTblSetGrab().getModel();
        tabla.setNumRows(0);

        List<SetGrabacion> instrumento = modelo.listaSetGrabTabla();
        instrumento.stream().forEach(p -> {
            String[] datos = {String.valueOf(p.getSet_codigo()), p.getSet_nombre(), p.getSet_tamanio(), p.getSet_ubicacion()};
            tabla.addRow(datos);
        });
    }

    private void crearEditarSetGrab() {
        if ("Crear nuevo Set de grabacion".equals(vista.getjDlgSetGrab().getName())) {

//            INSERTAR
            if (validarDatos()) {
                ModeloSetGrab set = new ModeloSetGrab();
                set.setSet_codigo(codigoSetGrab);
                set.setSet_nombre(vista.getTxtNombre().getText());
                set.setSet_tamanio(vista.getSpinnerTamanio().getValue().toString());
                set.setSet_ubicacion(vista.getTxtUbicacion().getText());
                                
                if (set.crearSetGrabacion() == null) {
                    vista.getjDlgSetGrab().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "set de grabacion creado satisfactoriamente");
                    cargarTablaDeSetGrab();
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo crear el set de grabacion");
                }
            }

        } else {

            //EDITAR
            if (validarDatos()) {
                ModeloSetGrab set = new ModeloSetGrab();
//                inst.setIns_codigo(codigoInstrumento);
                set.setSet_codigo(codigoSetGrab);
                set.setSet_nombre(vista.getTxtNombre().getText());
                set.setSet_tamanio(vista.getSpinnerTamanio().getValue().toString());
                set.setSet_ubicacion(vista.getTxtUbicacion().getText());
                
                if (set.modificarSetGrabacion() == null) {
                    vista.getjDlgSetGrab().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Set de grabacion modificado satisfactoriamente");
                    cargarTablaDeSetGrab();
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo modificar el set de grabacion");
                }
            }
        }

        cargarTablaDeSetGrab(); //Actualizo la tabla con los datos
    }
//
    public void eliminarInstrumento() {

        int fila = vista.getTblSetGrab().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            int response = JOptionPane.showConfirmDialog(vista, "¿Seguro que desea eliminar esta información?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {

                int codigo;
                codigo = Integer.parseInt(vista.getTblSetGrab().getValueAt(fila, 0).toString());

                if (modelo.eliminarSetGrabacion(codigo) == null) {
                    JOptionPane.showMessageDialog(null, "El set de grabacion fue eliminado exitosamente");
                    cargarTablaDeSetGrab();//Actualizo la tabla con los datos
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El set de grabacion no pudo ser eliminado");
                }
            }
        }
    }

    int codigoSetGrab;//Variable que almacenara el codigo del curso traido de la BD

    public void cargarDatosInstrumentoEnTXT() {
        int fila = vista.getTblSetGrab().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            //Abrir jDialog de campos de Docente
            vista.getjDlgSetGrab().setName("Modificar Set de grabacion");
            vista.getjDlgSetGrab().setLocationRelativeTo(null);
            vista.getjDlgSetGrab().setSize(1169, 689);
            vista.getjDlgSetGrab().setTitle("Modificar set de grabacion");
            vista.getjDlgSetGrab().setVisible(true);

            
            List<SetGrabacion> listap = modelo.listaSetGrabTabla();

            listap.stream().forEach(setg -> {

                if (setg.getSet_codigo() == Integer.parseInt(vista.getTblSetGrab().getValueAt(fila, 0).toString())) {
                    codigoSetGrab = setg.getSet_codigo();
                    
                    vista.getTxtNombre().setText(setg.getSet_nombre());
                    vista.getTxtUbicacion().setText(setg.getSet_ubicacion());
                    vista.getSpinnerTamanio().setValue(setg.getSet_tamanio());
                    
                }
            });
        }
    }

    public void buscarInstrumento() {

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

                DefaultTableModel tabla = (DefaultTableModel) vista.getTblSetGrab().getModel();
                tabla.setNumRows(0);

                List<SetGrabacion> instrumento = modelo.buscarSetGrabacion(vista.getTxtBuscar().getText());
                instrumento.stream().forEach(p -> {
                    String[] datos = {p.getSet_nombre(), p.getSet_ubicacion(), String.valueOf(p.getSet_tamanio())};
                    tabla.addRow(datos);
                });
            }
        };

        vista.getTxtBuscar().addKeyListener(eventoTeclado); //"addKeyListener" es un metodo que se le tiene que pasar como argumento un objeto de tipo keyListener 
    }

    public boolean validarDatos() {
        Validaciones mivalidacion = new Validaciones();

        boolean validar = true;

        if (vista.getTxtNombre().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
            validar = false;
        } else {
            if (!mivalidacion.validarTextoConEspacio(vista.getTxtNombre().getText())) {
                JOptionPane.showMessageDialog(null, "Nombre incorrecto");
                validar = false;
            }
        }
        if (vista.getTxtUbicacion().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una ubicacion");
            validar = false;
        } else {
            if (!mivalidacion.validarTextoConEspacio(vista.getTxtUbicacion().getText())) {
                JOptionPane.showMessageDialog(null, "Ubicacion icorrecta");
                validar = false;
            }
        }
//        if (vista.getTxtMarca().getText().isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Ingrese la marca");
//            validar = false;
//        } else {
//            if (!mivalidacion.validarPeriodoAcademico(vista.getTxtPeriodo().getText())) {
//                JOptionPane.showMessageDialog(null, "Marca incorrecta");
//                validar = false;
//            }
//        }

        
        return validar;
    }

    public void limpiarDatos() {
        
        vista.getTxtNombre().setText("");
        vista.getTxtUbicacion().setText("");
        vista.getSpinnerTamanio().setValue(0);
}
}
