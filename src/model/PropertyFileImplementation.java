/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import excepciones.EmptyFileException;
import java.util.ResourceBundle;

/**
 * Devuelve a la clase ModelFactory un String que es leido por un archivo de configuracion config.properties
 * @author Diego, Andres
 */
public class PropertyFileImplementation implements Model {

    @Override
    /**
     * Método que recive el saludo desde el fichero de configuración
     */
    public String getGreeting() throws EmptyFileException {
        String mensaje;
        mensaje = ResourceBundle.getBundle("utilidades.config").getString("saludo");
        if (mensaje.isEmpty()) {
            throw new EmptyFileException("El archivo de configuración está vacio");
        } else {
            
            return mensaje;
        } 
            
    }

    
}
