/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Esta excepcion conprueba que la base de datos no está vacia
 * @author Diego
 */
public class EmptyDatabaseException extends Exception {
    private static final long serialVersionUID = 1L;

    public EmptyDatabaseException(String message) {
        super(message);
    }
    
}
