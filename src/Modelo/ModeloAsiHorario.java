package Modelo;

import java.sql.SQLException;
import java.util.Date;

public class ModeloAsiHorario extends AsiHorario {

    ConexionPG conpg = new ConexionPG();

    public ModeloAsiHorario() {
    }

    public ModeloAsiHorario(int asih_codigo, int asih_codcurso, int asih_codhorario, Date asih_fecha, String asih_estado) {
        super(asih_codigo, asih_codcurso, asih_codhorario, asih_fecha, asih_estado);
    }

    public SQLException asignarHorario() {
        String sql = "INSERT INTO asihorario(asih_codcurso, asih_codhorario, asih_fecha, asih_estado) VALUES (" + getAsih_codcurso() + ", " + getAsih_codhorario() + ", '" + getAsih_fecha() + "', 'A');";

        return conpg.accion(sql);
    }
}
