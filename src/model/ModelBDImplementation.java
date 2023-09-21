/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import excepciones.BDConectionException;
import excepciones.EmptyDatabaseException;

/**
 * Clase dedicada a la implementacion del modelo respecto a la base de datos
 * @author Diego
 */
public class ModelBDImplementation implements Model {

    @Override
    public String getGreeting() throws BDConectionException, EmptyDatabaseException {
      return null;
    }
    
}
