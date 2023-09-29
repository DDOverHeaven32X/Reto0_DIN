/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import excepciones.BDConectionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 * Test que comprueba los métodos principales de la implementación de base de datos
 * @author Diego
 */
public class ModelBDImplementationTest {
    
    
    
    public ModelBDImplementationTest() {
    }

    /**
     * Test que comprueba que la conexión a base de datos es funcional
     */
    @Before
    public void testOpenConnection(){
        ModelBDImplementation modelBD = new ModelBDImplementation();
        try {
            modelBD.openConnection();
        } catch (BDConectionException e) {
            Logger.getLogger(ModelBDImplementation.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    /**
     * Test que comprueba que el método getGreeting recive el mensaje desde base de datos.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetGreeting() throws Exception {
        ModelBDImplementation modelBD = new ModelBDImplementation();
        String resultadoEspe = "Hola Mundo";
        String result = modelBD.getGreeting();
        assertEquals(resultadoEspe, result);
    }
    
}
