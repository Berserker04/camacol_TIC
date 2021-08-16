package Model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.vo.Requerimiento_1;
import util.JDBCUtilities;
//import utp.misiontic2022.c2.p23.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        // Su código
        ArrayList<Requerimiento_1> respuesta = new ArrayList<Requerimiento_1>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String sql = ""
                    + "SELECT Constructora, Ciudad, Banco_Vinculado, Porcentaje_Cuota_Inicial, Clasificacion, Fecha_Inicio "
                    + "FROM Proyecto " + "WHERE Ciudad = 'Pereira'";

            Statement stm = conexion.createStatement();
            ResultSet res = stm.executeQuery(sql);
            // Recorrer los registros en los VO específicos

            while (res.next()) {
                // System.out.println(res.getString("Porcentaje_Cuota_Inicial"));
                Requerimiento_1 req_1 = new Requerimiento_1();
                req_1.setConstructora(res.getString("Constructora"));
                req_1.setCiudad(res.getString("Ciudad"));
                req_1.setBanco(res.getString("Banco_Vinculado"));
                req_1.setPorcentaje(Double.parseDouble(res.getString("Porcentaje_Cuota_Inicial")));
                req_1.setClasificacion(res.getString("Clasificacion"));
                req_1.setFecha(res.getString("Fecha_Inicio"));
                respuesta.add(req_1);
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