/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import excepciones.BDConectionException;
import excepciones.EmptyDatabaseException;
import excepciones.EmptyFileException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ModelFactory;
import ui.ViewFactory;

/**
 * Clase Main de la aplicación java fx
 *
 * @author andres, Diego
 */
public class Main extends Application/*Extends javafx.application.Applcation*/ {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("/ui/saludo.fxml"));
        Parent root = (Parent)loader.load();
        Saludocontroller controller= ((Saludocontroller)loader.getController());
        controller.setStage(stage);
        controller.initStage(root);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        launch(args);
    }

}
