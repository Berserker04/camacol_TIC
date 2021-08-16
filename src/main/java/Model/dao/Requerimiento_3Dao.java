package Model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.vo.Requerimiento_3;
import utp.misiontic2022.c2.p23.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {

        ArrayList<Requerimiento_3> respuesta = new ArrayList<Requerimiento_3>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String sql = "" + "SELECT Cargo, MAX(l.Salario) as Salario FROM Lider l "
                    + "GROUP By Cargo HAVING MAX(l.Salario)>700000";

            Statement stm = conexion.createStatement();
            ResultSet res = stm.executeQuery(sql);
            // Recorrer los registros en los VO específicos

            while (res.next()) {
                Requerimiento_3 req_3 = new Requerimiento_3();
                req_3.setCargo(res.getString("Cargo"));
                req_3.setMaxSalario(Integer.parseInt(res.getString("Salario")));
                respuesta.add(req_3);
            }

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            conexion.close();
        }

        // Retornar la colección de vo's
        return respuesta;

    }
}