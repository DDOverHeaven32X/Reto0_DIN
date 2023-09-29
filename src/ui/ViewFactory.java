/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ResourceBundle;
import model.ModelBDImplementation;

/**
 * Factoria de la vista, decide si mostrar el mensaje desde la consola o con una interfaz gráfica
 * @author Diego
 */
public class ViewFactory {
    /**
     * Método para crear una instancia de la vista dependiendo del fichero de configuración
     * @return 
     */
    public View getView(){
        View view = null;
        String opcion =  ResourceBundle.getBundle("utilidades.config").getString("method");
        
        //Parametrización
        if (opcion.equalsIgnoreCase("console")) {
            view = new ViewImplementation();

        } else if (opcion.equalsIgnoreCase("fx")) {
            view = new ViewJavaFXImplementation();
        }

        return view;
        
    }
}
