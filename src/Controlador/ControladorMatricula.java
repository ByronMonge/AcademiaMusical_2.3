
package Controlador;

import Modelo.ModeloMatricula;
import Vista.VistaMatricula;

public class ControladorMatricula {
    
    ModeloMatricula modelo;
    VistaMatricula vista;

    public ControladorMatricula(ModeloMatricula modelo, VistaMatricula vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
    }
    
    public void iniciarControl(){
        
    }
    
    //Todo sobre estudiante
    public void abrirjDialogEstudiante() {
        vista.getjDlgBuscarEstudiante().setLocationRelativeTo(null);
        vista.getjDlgBuscarEstudiante().setSize(587, 422);
        vista.getjDlgBuscarEstudiante().setTitle("Seleccione un estudiante");
        vista.getjDlgBuscarEstudiante().setVisible(true);
        //cargarRegistroDePersonas();
        //buscarPersona();
    }
    
    //Todo sobre curso
    public void abrirjDialogCurso() {
        vista.getjDlgBuscarCurso().setLocationRelativeTo(null);
        vista.getjDlgBuscarCurso().setSize(587, 422);
        vista.getjDlgBuscarCurso().setTitle("Seleccione un curso");
        vista.getjDlgBuscarCurso().setVisible(true);
        //cargarRegistroDePersonas();
        //buscarPersona();
    }
    
    
}
