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
 * Clase Main de la aplicación
 *
 * @author andres, Diego
 */
public class Main extends Application/*Extends javafx.application.Applcation*/ {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        launch(args);
    }

}
