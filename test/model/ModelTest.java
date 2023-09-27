/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import excepciones.BDConectionException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test de la interfaz Modelo
 * @author Diego
 */
public class ModelTest {
    
    public ModelTest() {
    }

    /**
     * Test que comprueba que la interfaz del modelo recibe el mensaje.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetGreeting() throws Exception {
        Model md = new PropertyFileImplementation();
        String resultadoEspe = "Hola Mundo";
        String result = md.getGreeting();
        assertEquals(resultadoEspe, result);
    }

    
}
