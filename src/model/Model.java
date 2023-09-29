/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import excepciones.BDConectionException;
import excepciones.EmptyDatabaseException;
import excepciones.EmptyFileException;
/**
 * Interfaz que recoge el metodo getString
 * @author Andres,Diego
 */
public interface Model {
    /**
     * Método que recive el saludo
     * @return 
     * @throws excepciones.BDConectionException 
     * @throws excepciones.EmptyDatabaseException 
     * @throws excepciones.EmptyFileException 
     */
    public String getGreeting() throws BDConectionException, EmptyDatabaseException, EmptyFileException;
    
}
