package Controlador;

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
        vista.getBtnGuardar().addActionListener(l -> crearEditarInstrumento());
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
        vista.getjDlgInstrumento().setTitle("Crear nuevo instrumento");
        vista.getjDlgInstrumento().setVisible(true);
        vista.getTxtnombreset().setEnabled(false);
        vista.getTxtUbicacionSet().setEnabled(false);
        vista.getTxtTamanio().setEnabled(false);
        vista.getTxtCodigoSet().setVisible(false);

        //Limpiar los datos del jDialog
        limpiarDatos();
    }
    
    public void cargarTablaDeInstrumento() {
        DefaultTableModel tabla = (DefaultTableModel) vista.getTblInstrumento().getModel();
        tabla.setNumRows(0);
        
        List<Instrumentos> instrumento = modelo.listaInstumentoTabla();
        instrumento.stream().forEach(p -> {
            String[] datos = {String.valueOf(p.getIns_codigo()), p.getIns_nombre(), p.getIns_marca(), p.getIns_tipo(), String.valueOf(p.getIns_valor())};
            tabla.addRow(datos);
        });
    }
    
    private void crearEditarInstrumento() {
        if ("Crear nuevo instrumento".equals(vista.getjDlgInstrumento().getName())) {

            //INSERTAR
            if (validarDatos()) {
                ModeloInstrumento ins = new ModeloInstrumento();
                ins.setIns_nombre(vista.getTxtnombre().getText());
                ins.setIns_setcodigo(Integer.parseInt(vista.getTxtCodigoSet().getText()));
                ins.setIns_marca(vista.getTxtMarca().getText());
                ins.setIns_tipo(vista.getTxtTipo().getText());
                ins.setIns_valor(Double.parseDouble(vista.getjSpinnerValor().getValue().toString()));
                
                if (ins.crearInstrumento() == null) {
                    vista.getjDlgInstrumento().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Instrumento creado satisfactoriamente");
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo crear el instrumento");
                }
            }
            
        } else {
            //EDITAR
            if (validarDatos()) {
                ModeloInstrumento inst = new ModeloInstrumento();
                
                inst.setIns_codigo(codigoInstrumento);
                inst.setIns_setcodigo(Integer.parseInt(vista.getTxtCodigoSet().getText()));
                
                inst.setIns_nombre(vista.getTxtnombre().getText());
                inst.setIns_marca(vista.getTxtMarca().getText());
                inst.setIns_tipo(vista.getTxtTipo().getText());
                inst.setIns_valor(Double.parseDouble(vista.getjSpinnerValor().getValue().toString()));
                
                if (inst.modificarInstrumento() == null) {
                    vista.getjDlgInstrumento().setVisible(false);
                    JOptionPane.showMessageDialog(vista, "Instrumento modificado satisfactoriamente");
                    
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo modificar el instrumento");
                }
            }
        }
        
        cargarTablaDeInstrumento(); //Actualizo la tabla con los datos
    }
    
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
    
    int codigoInstrumento;//Variable que almacenara el codigo del instrumento traido de la BD

    public void cargarDatosInstrumentoEnTXT() {
        int fila = vista.getTblInstrumento().getSelectedRow();
        
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Aun no ha seleccionado una fila");
        } else {
            
            vista.getTxtCodigoSet().setVisible(false);
            ModeloSetGrab modeloSet = new ModeloSetGrab();

            //Abrir jDialog de campos de Docente
            vista.getjDlgInstrumento().setName("Modificar instrumento");
            vista.getjDlgInstrumento().setLocationRelativeTo(null);
            vista.getjDlgInstrumento().setSize(1169, 689);
            vista.getjDlgInstrumento().setTitle("Modificar instrumento");
            vista.getjDlgInstrumento().setVisible(true);
            
            List<Instrumentos> listai = modelo.listaInstumentoTabla();
            List<SetGrabacion> listas = modeloSet.listaSetGrabTabla();
            
            listai.stream().forEach(instrumento -> {
                
                if (instrumento.getIns_codigo() == Integer.parseInt(vista.getTblInstrumento().getValueAt(fila, 0).toString())) {
                    
                    listas.stream().forEach(s -> {
                        
                        if (instrumento.getIns_setcodigo() == s.getSet_codigo()) {
                            codigoInstrumento = instrumento.getIns_codigo();
                            vista.getTxtnombre().setText(instrumento.getIns_nombre());
                            vista.getTxtMarca().setText(instrumento.getIns_marca());
                            vista.getTxtTipo().setText(instrumento.getIns_tipo());
                            vista.getjSpinnerValor().setValue(instrumento.getIns_valor());
                            vista.getTxtnombreset().setText(s.getSet_nombre());
                            vista.getTxtTamanio().setText(s.getSet_tamanio());
                            vista.getTxtUbicacionSet().setText(s.getSet_ubicacion());
                            vista.getTxtCodigoSet().setText(String.valueOf(s.getSet_codigo()));
                        }
                    });
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
                    String[] datos = {String.valueOf(p.getIns_codigo()), p.getIns_nombre(), p.getIns_marca(), p.getIns_tipo(), String.valueOf(p.getIns_valor())};
                    tabla.addRow(datos);
                });
            }
        };
        
        vista.getTxtBuscar().addKeyListener(eventoTeclado); //"addKeyListener" es un metodo que se le tiene que pasar como argumento un objeto de tipo keyListener 
    }

    //INFORMACION SOBRE EL SET DE GRABACION
    public void abrirjDlgCargarSet() {
        vista.getjDlgCargarSet().setLocationRelativeTo(vista);
        vista.getjDlgCargarSet().setSize(731, 506);
        vista.getjDlgCargarSet().setTitle("Seleccionar set de grabacion");
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
            
            ModeloSetGrab modeloSet = new ModeloSetGrab();
            List<SetGrabacion> sets = modeloSet.listaSetGrabTabla();
            sets.stream().forEach(s -> {
                
                if (s.getSet_codigo() == Integer.parseInt(vista.getTblSet().getValueAt(fila, 0).toString())) {
                    
                    vista.getTxtCodigoSet().setText(String.valueOf(s.getSet_codigo()));
                    vista.getTxtnombreset().setText(s.getSet_nombre());
                    vista.getTxtTamanio().setText(s.getSet_tamanio());
                    vista.getTxtUbicacionSet().setText(s.getSet_ubicacion());
                    vista.getjDlgCargarSet().dispose();//Cierro la ventana luego de cargar los datos
                }
            });
        }
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
        
        if (vista.getTxtMarca().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese la marca");
            validar = false;
        } else {
            if (!mivalidacion.validarTextoConEspacio(vista.getTxtMarca().getText())) {
                JOptionPane.showMessageDialog(null, "Marca incorrecta");
                validar = false;
            }
        }
        
        if (vista.getTxtTipo().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese el tipo de instrumento");
            validar = false;
        } else {
            if (!mivalidacion.validarTextoConEspacio(vista.getTxtTipo().getText())) {
                JOptionPane.showMessageDialog(null, "Tipo de instrumento incorrecto");
                validar = false;
            }
        }
        
        if (vista.getTxtnombreset().getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione un set de grabación");
            validar = false;
        }
        
        return validar;
    }
    
    public void limpiarDatos() {
        
        vista.getTxtnombre().setText("");
        vista.getTxtMarca().setText("");
        vista.getTxtTipo().setText("");
        vista.getTxtBuscarSet().setText("");
        vista.getTxtnombreset().setText("");
        vista.getTxtUbicacionSet().setText("");
        vista.getjSpinnerValor().setValue(0);
    }
}
