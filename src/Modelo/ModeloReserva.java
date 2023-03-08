package Modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloReserva extends Reserva {

    ConexionPG conpg = new ConexionPG();

    public ModeloReserva() {
    }

    public ModeloReserva(int res_codigo, int res_codestudiante, int res_codset, String res_especificacion, String res_estado, java.sql.Date res_fechareser, java.sql.Date res_fechaentra, java.sql.Date res_fechasali) {
        super(res_codigo, res_codestudiante, res_codset, res_especificacion, res_estado, res_fechareser, res_fechaentra, res_fechasali);
    }

    public SQLException insertarReserva() {
        String sql = "INSERT INTO reserva(res_codestudiante, res_codset, res_especificacion, res_fechareser,res_fechaentra,res_fechasali, res_estado) VALUES (" + getRes_codestudiante() + ", " + getRes_codset() + ", '" + getRes_especificacion() + "', '" + getRes_fechareser() + "', '" + getRes_fechaentra() + "', '" + getRes_fechasali() + "', 'A');";

        return conpg.accion(sql);
    }

    public SQLException modificarReserva() {
        String sql = "UPDATE reserva SET res_fechaentra = '" + getRes_fechaentra() + "',res_fechasali = '" + getRes_fechasali() + "',res_especificacion = '" + getRes_especificacion() + "' where res_codigo = " + getRes_codigo() + ";";

        return conpg.accion(sql);
    }

//    public SQLException modificarAsignacionCompleto() {
//        String sql = "UPDATE asiasignatura SET asig_coddoc = " + getAsig_coddoc() + ", asig_codasi = " + getAsig_codasi() + ", asig_fecha = '" + getAsig_fecha() + "' where asig_codigo = " + getAsig_codigo() + ";";
//
//        return conpg.accion(sql);
//    }

    public SQLException eliminarReserva(int codigoReserva) {
        String sql = "UPDATE reserva SET res_estado = 'I' where asig_codigo = " + codigoReserva + ";";

        return conpg.accion(sql);
    }

    public List<Reserva> listaReservasTabla() {
        try {
            List<Reserva> lista = new ArrayList<>();

            String sql = "select * from reserva where res_estado = 'A'";

            ResultSet rs = conpg.consulta(sql); //La consulta nos devuelve un "ResultSet"

            //Pasar de "ResultSet" a "List"
            while (rs.next()) {
                //Crear las instancias de los docentes
                Reserva reserva = new Reserva();

                //Todo lo que haga en la sentencia define como voy a extraer los datos
                reserva.setRes_codigo(rs.getInt("res_codigo"));
                reserva.setRes_codestudiante(rs.getInt("res_codestudiante"));
                reserva.setRes_codset(rs.getInt("res_codset"));
                reserva.setRes_especificacion(rs.getString("res_especificacion"));
                reserva.setRes_fechareser(rs.getDate("res_fechareser"));
                reserva.setRes_fechaentra(rs.getDate("res_fechaentra"));
                reserva.setRes_fechasali(rs.getDate("res_fechasali"));

                lista.add(reserva); //Agrego los datos a la lista
            }

            //Cierro la conexion a la BD
            rs.close();
            //Retorno la lista
            return lista;

        } catch (SQLException ex) {
            Logger.getLogger(ModeloReserva.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
