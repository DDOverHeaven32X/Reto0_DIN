/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;
import excepciones.BDConectionException;
import excepciones.EmptyDatabaseException;
import excepciones.EmptyFileException;
import model.Model;
import ui.View;

/**
 *  Controlador de la aplicación, se encarga de inicializar los métodos del modelo y la vista
 * @author Diego
 */
public class Controller {
    
    //Creamos el método run, el cual inicializará las implementaciones pasandole las interfaces como parámetro
    public void run(View viewImplementation, Model modelImplementation) throws BDConectionException, EmptyDatabaseException, EmptyFileException{

        viewImplementation.showGreeting(modelImplementation.getGreeting());
    
    }
}
