/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author anaca
 */
public class postgreeconexion {
    
    
       private final String url = "jdbc:postgresql://localhost/Seguridad";
    private final String user = "postgres";
    private final String password = "muni123$";

    
    
    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connectarPostgree() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion Satisfactoria.");
        } catch (Exception e) {
            System.out.println("Conexion Fallida.");
            System.out.println(e.getMessage());
        }

        return conn;
    } 
}
