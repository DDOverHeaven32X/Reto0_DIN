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
    public String getGreeting() throws BDConectionException;
    
}
