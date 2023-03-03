package Main;

import Controlador.ControladorPrincipal;
import Vista.VistaPrincipal;

public class Iniciar {

    public static void main(String[] args) {

        VistaPrincipal vistaPrincipal = new VistaPrincipal();

        ControladorPrincipal control = new ControladorPrincipal(vistaPrincipal);

        control.iniciarControl();

    }
}
