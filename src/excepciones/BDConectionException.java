/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 * Esta excepcion se encarga de si la BD está operativa
 * @author Diego
 */
public class BDConectionException extends Exception {
    
    private static final long serialVersionUID = 1L;

    public BDConectionException(String message) {
        super(message);
    }
    
}
