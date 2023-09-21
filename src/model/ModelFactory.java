/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 * Factoria que decide como se van a visualizar los datos mediante la info que salga en el fichero de configuracion
 * @author Diego, Andres
 */
public class ModelFactory {

    public Model getModel() {
        Model modelo = null;
        String opcion = ResourceBundle.getBundle("utilidades.config").getString("type");

        //Parametrización
        if (opcion.equalsIgnoreCase("fich")) {
            modelo = new PropertyFileImplementation();

        } else if (opcion.equalsIgnoreCase("bd")) {
            modelo = new ModelBDImplementation();
        }

        return modelo;

    }

}

