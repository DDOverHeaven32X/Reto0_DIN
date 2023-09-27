/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author conke
 */
public class ModelFactoryTest {
    
    public ModelFactoryTest() {
    }

    /**
     * Test of getModel method, of class ModelFactory.
     */
    @Test
    public void testGetModel() {
        ModelFactory instance = new ModelFactory();
        Model resultadoEspe = null;
        Model resultado = instance.getModel();
        assertEquals(resultadoEspe, resultado);
    }
    
}
