/**
 * No se debe modificar
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {    
    private static final String DATABASE_LOCATION = "ProyectosConstruccion.db";

    public static Connection getConnection() throws SQLException {
        
        try {
            Class.forName("org.sqlite.JDBC");
            
            String url = "jdbc:sqlite:" + DATABASE_LOCATION;

        return DriverManager.getConnection(url);
        } catch (Exception e) {
            return null;
        }
    }
}
