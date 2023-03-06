package Controlador;

import Modelo.Docente;
import Modelo.Estudiante;
import Modelo.ModeloAdministrador;
import Modelo.ModeloAsiAsignatura;
import Modelo.ModeloAsignatura;
import Modelo.ModeloAula;
import Modelo.ModeloCurso;
import Modelo.ModeloDocente;
import Modelo.ModeloEstudiante;
import Modelo.ModeloHorario;
import Modelo.ModeloInstrumento;
import Modelo.ModeloMatricula;
import Modelo.ModeloPersona;
import Modelo.ModeloProductor;
import Modelo.ModeloSetGrab;
import Modelo.Productor;
import Vista.VistaAdministrador;
import Vista.VistaAsiAsignatura;
import Vista.VistaAsignatura;
import Vista.VistaAula;
import Vista.VistaCurso;
import Vista.VistaDashboard;
import Vista.VistaDocente;
import Vista.VistaEstudiante;
import Vista.VistaHorario;
import Vista.VistaInstrumento;
import Vista.VistaMatricula;
import Vista.VistaPersona;
import Vista.VistaPrincipal;
import Vista.VistaProductor;
import Vista.VistaSetGrab;
import java.util.List;

public class ControladorPrincipal {
    
    VistaPrincipal vistaPrincipal;
    
    public ControladorPrincipal(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setVisible(true);
        vistaPrincipal.setLocationRelativeTo(null);
        DashBoard();
    }
    
    public void iniciarControl() {
        
        vistaPrincipal.getBtnRegistrarPersona().addActionListener(l -> registroPersona());
        vistaPrincipal.getBtnDocente().addActionListener(l -> registroDocente());
        vistaPrincipal.getBtnAdministrador().addActionListener(l -> registroAdministrador());
        vistaPrincipal.getBtnDashboard().addActionListener(l -> DashBoard());
        vistaPrincipal.getBtnCurso().addActionListener(l -> registroCurso());
        vistaPrincipal.getBtnAula().addActionListener(l -> registroAula());
        vistaPrincipal.getBtnEstudiante().addActionListener(l -> registroEstudiante());
        vistaPrincipal.getBtnAsignatura().addActionListener(l -> registroAsignatura());
        vistaPrincipal.getBtnProductor().addActionListener(l -> registroProductor());
        vistaPrincipal.getBtnAsignarAsignatura().addActionListener(l -> asignarAsignatura());
        vistaPrincipal.getBtnInstrumento().addActionListener(l -> registrarInstrumento());
        vistaPrincipal.getBtnSetGrab().addActionListener(l -> registrarSetGrabacion());
        vistaPrincipal.getBtnHorario().addActionListener(l -> registroHorario());
        vistaPrincipal.getBtnMatricula().addActionListener(l -> registroMatricula());
    }
    
    private void registroPersona() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane antes de abrir las ventanas

        //Instancio las clases del Modelo y la Vista.
        VistaPersona vista = new VistaPersona();
        ModeloPersona modelo = new ModeloPersona();

        //Agregar Vista Personas al Desktop Pane.
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorPersona control = new ControladorPersona(modelo, vista);
        control.iniciarControl();//Empezamos las escuchas a los eventos de la vista, Listeners.
    }
    
    private void registroDocente() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaDocente vista = new VistaDocente();
        ModeloDocente modelo = new ModeloDocente();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorDocente control = new ControladorDocente(modelo, vista);
        control.iniciarControl();
    }
    
    private void registroAdministrador() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaAdministrador vista = new VistaAdministrador();
        ModeloAdministrador modelo = new ModeloAdministrador();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorAdministrador control = new ControladorAdministrador(modelo, vista);
        control.iniciarControl();
    }
    
    private void registroProductor() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaProductor vista = new VistaProductor();
        ModeloProductor modelo = new ModeloProductor();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorProductor control = new ControladorProductor(modelo, vista);
        control.iniciarControl();
    }
    
    private void registroCurso() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaCurso vista = new VistaCurso();
        ModeloCurso modelo = new ModeloCurso();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorCurso control = new ControladorCurso(modelo, vista);
        control.iniciarControl();
    }
    
    private void registroAula() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaAula vista = new VistaAula();
        ModeloAula modelo = new ModeloAula();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorAula control = new ControladorAula(modelo, vista);
        control.iniciarControl();
    }
    
    private void DashBoard() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        //Instancio las clases del Modelo y la Vista.
        VistaDashboard vista = new VistaDashboard();

        //Agregar Vista Personas al Desktop Pane.
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        vista.setVisible(true);
        vista.setSize(vistaPrincipal.getEscritorioPrincipal().getWidth(), vistaPrincipal.getEscritorioPrincipal().getHeight());
        
        ModeloDocente docente = new ModeloDocente(); //Crear un objeto de Docente
        List<Docente> docentes = docente.listaDocentesTabla();
        
        ModeloEstudiante estudiante = new ModeloEstudiante(); //Crear un objeto de Estudiante
        List<Estudiante> estudiantes = estudiante.listaEstudiantesTabla();
        
        ModeloProductor productor = new ModeloProductor(); //Crear un objeto de Estudiante
        List<Productor> productores = productor.listaProductorTabla();
        //Setear en los labels del dashBoard la cantidad total de cada elemento que conforma la academia
        vista.getLblDocentes().setText(String.valueOf(docentes.stream().count())); //Seteo la cantidad de docentes     
        vista.getLblEstudiantes().setText(String.valueOf(estudiantes.stream().count()));//Seteo la cantidad de estudiantes
        vista.getLblProductores().setText(String.valueOf(productores.stream().count()));//Seteo la cantidad de productores
    }
    
    private void registroEstudiante() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        //Instancio las clases del Modelo y la Vista.
        VistaEstudiante vista = new VistaEstudiante();
        ModeloEstudiante modelo = new ModeloEstudiante();

        //Agregar Vista Personas al Desktop Pane.
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorEstudiante control = new ControladorEstudiante(modelo, vista);
        control.iniciarControl();//Empezamos las escuchas a los eventos de la vista, Listeners.
    }
    
    private void registroAsignatura() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaAsignatura vista = new VistaAsignatura();
        ModeloAsignatura modelo = new ModeloAsignatura();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorAsignatura control = new ControladorAsignatura(modelo, vista);
        control.iniciarControl();
    }
    
    private void asignarAsignatura() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaAsiAsignatura vista = new VistaAsiAsignatura();
        ModeloAsiAsignatura modelo = new ModeloAsiAsignatura();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorAsiAsignatura control = new ControladorAsiAsignatura(modelo, vista);
        control.iniciarControl();
    }
    
    private void registrarInstrumento() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaInstrumento vista = new VistaInstrumento();
        ModeloInstrumento modelo = new ModeloInstrumento();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorInstrumento control = new ControladorInstrumento(modelo, vista);
        control.iniciarControl();
    }
    
    private void registrarSetGrabacion() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaSetGrab vista = new VistaSetGrab();
        ModeloSetGrab modelo = new ModeloSetGrab();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorSetGrabacion control = new ControladorSetGrabacion(modelo, vista);
        control.iniciarControl();
    }
    
    private void registroHorario() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaHorario vista = new VistaHorario();
        ModeloHorario modelo = new ModeloHorario();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorHorario control = new ControladorHorario(modelo, vista);
        control.iniciarControl();
    }
    
    private void registroMatricula() {
        
        vistaPrincipal.getEscritorioPrincipal().removeAll(); //Remuevo todos los elementos que esten en sobre el desktopPane

        VistaMatricula vista = new VistaMatricula();
        ModeloMatricula modelo = new ModeloMatricula();
        
        vistaPrincipal.getEscritorioPrincipal().add(vista);
        
        ControladorMatricula control = new ControladorMatricula(modelo, vista);
        control.iniciarControl();
    }
}
