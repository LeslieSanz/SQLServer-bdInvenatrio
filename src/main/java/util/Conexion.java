package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    public static Connection getConexion(){ 
    Connection con = null;
    try { Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); 
        String url ="jdbc:sqlserver://localhost:1433;database=bdInventario"; 
        String usr = "sa"; 
        String psw = "alumnos"; 
        con = DriverManager.getConnection(url,usr,psw); 
        System.out.println("Conexion correcta con SQL Server!");
    } catch (ClassNotFoundException ex) { 
        System.out.println("No hay Driver!!"); 
    } catch (SQLException ex) { 
        System.out.println("Error con la BD"+ex.getMessage()); }
    return con; 
   }   
}
