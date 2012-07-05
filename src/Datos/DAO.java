/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Eddy
 */
public class DAO {

    protected Connection conn = null;
    protected PreparedStatement preparedStatement = null;
    protected ResultSet result = null;
    
    private final String url = "jdbc:mysql://localhost/mooodle";
    private final String driverName = "com.mysql.jdbc.Driver";
    private final String userName = "root";
    private final String password = "egv241288";

    public DAO() {
        try {
            Class.forName(driverName);
            conn = (Connection) DriverManager.getConnection(url, userName, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void cerrarConexion() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar las conexiones: " + e);
        }
    }
}
