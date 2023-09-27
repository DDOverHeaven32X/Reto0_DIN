/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import excepciones.EmptyFileException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test de la clase PropertyFileImplementation del Modelo
 * @author Diego
 */
public class PropertyFileImplementationTest {
    
    public PropertyFileImplementationTest() {
    }

    /**
     * Test que testea que el método lee la variable asignada en el archivo de configuración
     */
    @Test
    public void testGetGreeting()  {
        try {
            PropertyFileImplementation propFile = new PropertyFileImplementation();
            String resultadoEspe = "Hola Mundo";
            String result = propFile.getGreeting();
            assertEquals(resultadoEspe, result);
        } catch(EmptyFileException e){
            Logger.getLogger(PropertyFileImplementation.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
    
}
