/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Curso;
import Modelo.ModeloSetGrab;
import Modelo.Instrumentos;
import Modelo.ModeloInstrumento;
import Modelo.SetGrabacion;
import Vista.VistaInstrumento;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.ws.Holder;
//0964018360

/**
 *
 * @author Usuario
 */
public class ControladorInstrumento {

    ModeloInstrumento modelo;
    VistaInstrumento vista;

    public ControladorInstrumento(ModeloInstrumento modelo, VistaInstrumento vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        vista.getjDlgInstrumento().setResizable(false);
        cargarTablaDeInstrumento();
    }

    public void iniciarControl() {
        vista.getBtnCrear().addActionListener(l -> abrirDialogCrear());
        vista.getBtnGuardar().addActionListener(l -> crearEditarCurso());
        vista.getBtnActualizar().addActionListener(l -> cargarTablaDeInstrumento());
        vista.getBtnModificar().addActionListener(l -> cargarDatosInstrumentoEnTXT());
        vista.getBtnEliminar().addActionListener(l -> eliminarInstrumento());
        vista.getBtnCargar().addActionListener(l -> abrirjDlgCargarSet());
        vista.getBtnCargarSetGrba().addActionListener(l -> cargarDatosSetGrabEnTXT());
        buscarInstrumento();
    }

    public void abrirDialogCrear() {
        vista.getjDlgInstrumento().setName("Crear nuevo instrumento");
        vista.getjDlgInstrumento().setLocationRelativeTo(vista);
        vista.getjDlgInstrumento().setSize(890, 508);
        vista.getjDlgInstrumento().setTitle("Crear nuevo isntrumento");
        vista.getjDlgInstrumento().setVisible(true);
        vista.getTxtnombreset().setEnabled(false);
        vista.getTxtUbicacionSet().setEnabled(false);
        vista.getTxtTamanio().setEnabled(false);

        //Limpiar los datos del jDialog
        limpiarDatos();
    }

    public void cargarTablaDeInstrumento() {
        DefaultTableModel tabla = (DefaultTableModel) vista.getTblInstrumento().getModel();
        tabla.setNumRows(0);

        List<Instrumentos> instrumento = modelo.listaInstumentoTabla();
        instrumento.stream().forEach(p -> {
            String[] datos = {String.valueOf(p.getIns_codigo()), p.getIns_nombre(), p.getIns_tipo(), p.getIns_marca(), String.valueOf(p.getIns_valor())};
            tabla.addRow(datos);
        });
    }

    private void crearEditarCurso() {
        if ("Crear nuevo Instrumento".equals(vista.getjDlgInstrumento().getName())) {

//            INSERTAR
            if (validarDatos()) {
                ModeloInstrumento ins = new ModeloInstrumento();
                ins.setIns_nombre(vista.getTxtnombre().getText());
                ins.setIns_tipo(vista.getTxtTipo().getText());
                ins.setIns_tipo(vista.getTxtTipo().getText());
//                ins.setIns_valor(Double.parseDouble(vista.getTxtValor().toString()));

                if (ins.crearInstrumento() == null) {
                    vista.getjDlgInstrumento().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Curso creado satisfactoriamente");
                    cargarTablaDeInstrumento();
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo crear el curso");
                }
            }

        } else {

            //EDITAR
            if (validarDatos()) {
                ModeloInstrumento inst = new ModeloInstrumento();
//                inst.setIns_codigo(codigoInstrumento);
                inst.setIns_nombre(vista.getTxtnombre().getText());
                inst.setIns_marca(vista.getTxtMarca().getText());
                inst.setIns_tipo(vista.getTxtTipo().getText());
//                inst.setIns_valor(Double.parseDouble(vista.getTxtValor().toString()));

                if (inst.modificarInstrumento() == null) {
                    vista.getjDlgInstrumento().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Instrumento modificado satisfactoriamente");
                    cargarTablaDeInstrumento();
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo modificar el instrumento");
                }
            }
        }

        cargarTablaDeInstrumento(); //Actualizo la tabla con los datos
    }
//

    public void eliminarInstrumento() {

        int fila = vista.getTblInstrumento().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            int response = JOptionPane.showConfirmDialog(vista, "¿Seguro que desea eliminar esta información?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {

                int codigo;
                codigo = Integer.parseInt(vista.getTblInstrumento().getValueAt(fila, 0).toString());

                if (modelo.eliminarInstrumento(codigo) == null) {
                    JOptionPane.showMessageDialog(null, "El instrumento fue eliminado exitosamente");
                    cargarTablaDeInstrumento();//Actualizo la tabla con los datos
                } else {
                    JOptionPane.showMessageDialog(null, "Error: El instrumento no pudo ser eliminado");
                }
            }
        }
    }

    int codigoInstrumento;//Variable que almacenara el codigo del curso traido de la BD

    public void cargarDatosInstrumentoEnTXT() {
        int fila = vista.getTblInstrumento().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            //Abrir jDialog de campos de Docente
            vista.getjDlgInstrumento().setName("Modificar curso");
            vista.getjDlgInstrumento().setLocationRelativeTo(null);
            vista.getjDlgInstrumento().setSize(1169, 689);
            vista.getjDlgInstrumento().setTitle("Modificar curso");
            vista.getjDlgInstrumento().setVisible(true);

            List<Instrumentos> listap = modelo.listaInstumentoTabla();

            listap.stream().forEach(instrumento -> {

                if (instrumento.getIns_codigo() == Integer.parseInt(vista.getTblInstrumento().getValueAt(fila, 0).toString())) {
                    codigoInstrumento = instrumento.getIns_codigo();
//                    String valor = String.valueOf(vista.getTxtValor().toString());
                    vista.getTxtnombre().setText(instrumento.getIns_nombre());
                    vista.getTxtMarca().setText(instrumento.getIns_marca());
                    vista.getTxtTipo().setText(instrumento.getIns_tipo());
//                    vista.getTxtValor().setText(valor);
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

                DefaultTableModel tabla = (DefaultTableModel) vista.getTblInstrumento().getModel();
                tabla.setNumRows(0);

                List<Instrumentos> instrumento = modelo.buscarInstrumento(vista.getTxtBuscar().getText());
                instrumento.stream().forEach(p -> {
                    String[] datos = {p.getIns_nombre(), p.getIns_marca(), p.getIns_tipo(), String.valueOf(p.getIns_codigo()), String.valueOf(p.getIns_valor())};
                    tabla.addRow(datos);
                });
            }
        };

        vista.getTxtBuscar().addKeyListener(eventoTeclado); //"addKeyListener" es un metodo que se le tiene que pasar como argumento un objeto de tipo keyListener 
    }

    public boolean validarDatos() {
        Validaciones mivalidacion = new Validaciones();

        boolean validar = true;

        if (vista.getTxtnombre().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un nombre");
            validar = false;
        } else {
            if (!mivalidacion.validarTextoConEspacio(vista.getTxtnombre().getText())) {
                JOptionPane.showMessageDialog(null, "Nombre incorrecto");
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

        vista.getTxtnombre().setText("");
        vista.getTxtMarca().setText("");
        vista.getTxtTipo().setText("");
        vista.getTxtBuscarSet().setText("");
        vista.getTxtnombreset().setText("");
        
    }
    public void abrirjDlgCargarSet() {
        vista.getjDlgCargarSet().setLocationRelativeTo(vista);
        vista.getjDlgCargarSet().setSize(731, 506);
        vista.getjDlgCargarSet().setTitle("Seleccionar cliente");
        vista.getjDlgCargarSet().setVisible(true);
        cargarDatosDeSetGrab();
        
    }
    public void cargarDatosDeSetGrab() {

        ModeloSetGrab modeloCliente = new ModeloSetGrab();
        vista.getTblSet().setRowHeight(25);
        DefaultTableModel estructuraTabla = (DefaultTableModel) vista.getTblSet().getModel();
        estructuraTabla.setRowCount(0);

        List<SetGrabacion> listap = modeloCliente.listaSetGrabTabla();

        Holder<Integer> i = new Holder<>(0);

        listap.stream().forEach(setgr -> {

            estructuraTabla.addRow(new Object[4]);

            vista.getTblSet().setValueAt(setgr.getSet_codigo(), i.value, 0);
            vista.getTblSet().setValueAt(setgr.getSet_nombre(), i.value, 1);
            vista.getTblSet().setValueAt(setgr.getSet_tamanio(), i.value, 2);
            vista.getTblSet().setValueAt(setgr.getSet_ubicacion(), i.value, 3);

            i.value++;
        });
    }
    public void cargarDatosSetGrabEnTXT() {
        int fila = vista.getTblSet().getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {

            String codigo;
            String nombre;
            String ubicacion;
            String tamanio;

            codigo = vista.getTblSet().getValueAt(fila, 0).toString();
            System.out.println("1");
            nombre = vista.getTblSet().getValueAt(fila, 1).toString();
            System.out.println("2");
            tamanio = vista.getTblSet().getValueAt(fila, 2).toString();
            System.out.println("3");
          ubicacion = vista.getTblSet().getValueAt(fila, 3).toString();
          System.out.println("4");

            vista.getTxtnombreset().setText(nombre);
            vista.getTxtTamanio().setText(tamanio);
          vista.getTxtUbicacionSet().setText(ubicacion);
            vista.getjDlgCargarSet().dispose();//Cierro la ventana luego de cargar los datos
        }
    }
}
