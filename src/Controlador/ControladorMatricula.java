package Controlador;

import Modelo.ModeloMatricula;
import Vista.VistaMatricula;
import Vista.VistaPrincipal;

public class ControladorMatricula {

    ModeloMatricula modelo;
    VistaMatricula vista;

    VistaPrincipal p = new VistaPrincipal();

    public ControladorMatricula(ModeloMatricula modelo, VistaMatricula vista) {
        this.modelo = modelo;
        this.vista = vista;
        vista.setVisible(true);
        vista.setSize(p.getEscritorioPrincipal().getWidth(), p.getEscritorioPrincipal().getHeight());
    }

    public void iniciarControl() {

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
