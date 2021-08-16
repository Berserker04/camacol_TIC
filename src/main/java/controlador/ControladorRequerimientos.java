package utp.misiontic2022.c2.p23.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import Model.dao.Requerimiento_1Dao;
import Model.dao.Requerimiento_2Dao;
import Model.dao.Requerimiento_3Dao;
import Model.vo.Requerimiento_1;
import Model.vo.Requerimiento_2;
import Model.vo.Requerimiento_3;

public class ControladorRequerimientos {

    // Su código

    private final Requerimiento_1Dao requerimiento1Dao;
    private final Requerimiento_2Dao requerimiento2Dao;
    private final Requerimiento_3Dao requerimiento3Dao;

    public ControladorRequerimientos() {
        this.requerimiento1Dao = new Requerimiento_1Dao();
        this.requerimiento2Dao = new Requerimiento_2Dao();
        this.requerimiento3Dao = new Requerimiento_3Dao();

    }

    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        // Su código
        return requerimiento1Dao.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        // Su código
        return requerimiento2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        // Su código
        return requerimiento3Dao.requerimiento3();
    }
}
