package Model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Model.vo.Requerimiento_2;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        // Su código

        ArrayList<Requerimiento_2> respuesta = new ArrayList<Requerimiento_2>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String sql = "" + "SELECT c.Proveedor, p.Constructora, c.Pagado " + "FROM Compra c "
                    + "INNER JOIN Proyecto p ON c.ID_Proyecto = p.ID_Proyecto "
                    + "WHERE c.Proveedor in ('Homecenter', 'JUMBO') " + " AND c.Pagado = 'Si' "
                    + "AND p.Constructora LIKE '%S.A.' " + "ORDER BY Proveedor ";

            Statement stm = conexion.createStatement();
            ResultSet res = stm.executeQuery(sql);
            // Recorrer los registros en los VO específicos

            while (res.next()) {
                Requerimiento_2 req_2 = new Requerimiento_2();
                req_2.setConstructora(res.getString("Constructora"));
                req_2.setProveedor(res.getString("Proveedor"));
                req_2.setPagado(res.getString("Pagado"));
                respuesta.add(req_2);
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