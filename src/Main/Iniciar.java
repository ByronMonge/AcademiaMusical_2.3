package Main;

//import Controlador.ControladorPrincipal;
import Controlador.ControladorLogin;
import Vista.VistaLogin;

//import Vista.VistaPrincipal;
public class Iniciar {

    public static void main(String[] args) {

        VistaLogin vistaLogin = new VistaLogin();
        ControladorLogin control = new ControladorLogin(vistaLogin);
        control.iniciarControl();

    }
}
