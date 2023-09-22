/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import excepciones.BDConectionException;
import excepciones.EmptyDatabaseException;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * Clase dedicada a la implementacion del modelo respecto a la base de datos
 * @author Diego
 */
public class ModelBDImplementation implements Model {
    
    //Métodos para inicializar la conexión con base de datos
    private Connection conex;
    private PreparedStatement stmt;
    private ResourceBundle configFile;
    private String url;
    private String user;
    private String password;
    
    //Consultas Query
    private final String getGreeting = "SELECT * FROM mensaje";
    
    //Constructor
    public ModelBDImplementation(){
        this.configFile = ResourceBundle.getBundle("utilidades.database");
        this.url = configFile.getString("Conn");
        this.user = configFile.getString("DBUser");
        this.password = configFile.getString("DBPass");
    }
    //Métodos para establecer conexión de base de datos
    private void openConnection() {
        try {
            // Class.forName(this.driverBD);
            conex = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
        } catch (SQLException e) {
            System.out.println("Error al intentar abrir la BD");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Se ha abierto la base de datos");
            e.printStackTrace();
        }
    } 
    private void closeConnection() throws SQLException {
        if (stmt != null) {
            stmt.close();
        }
        if (conex != null) {
            conex.close();
        }
    }

    //Método para recivir el saludo de la base de datos
    @Override
    public String getGreeting() {
        ResultSet rs = null;
        String greeting = null;
        
        this.openConnection();
        try {
            stmt = (PreparedStatement) conex.prepareStatement(getGreeting);
            rs = stmt.executeQuery();
            
            if (rs.next()) {
                greeting = rs.getString(1);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally{
            try {
                closeConnection();
                if(rs != null){
                    rs.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        
        return greeting;
    }
    
}
