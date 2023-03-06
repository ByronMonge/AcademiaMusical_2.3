package Modelo;

import java.sql.SQLException;
import java.util.Date;

public class ModeloMatricula extends Matricula {

    ConexionPG conpg = new ConexionPG();

    public ModeloMatricula() {
    }

    public ModeloMatricula(int mat_codigo, int mat_codAmd, int mat_codEst, int mat_codCur, Date mat_fechamatri, String mat_estado) {
        super(mat_codigo, mat_codAmd, mat_codEst, mat_codCur, mat_fechamatri, mat_estado);
    }

    public SQLException crearMatricula() {
        String sql = "INSERT INTO matricula(mat_codamd, mat_codest, mat_codcurso, mat_fechamatri, mat_estado) VALUES (" + getMat_codAmd() + ", " + getMat_codEst() + ", " + getMat_codCur() + ", '" + getMat_fechamatri() + "','A';";

        return conpg.accion(sql);
    }
}
