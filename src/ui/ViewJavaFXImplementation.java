/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;



import application.Saludocontroller;
import excepciones.EmptyFileException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 * Implementacion de la vista, enseña el mensaje desde una interfáz grafica y abre la ventana
 * @author Diego
 */
public class ViewJavaFXImplementation extends javafx.application.Application implements View {
    
    
    @FXML
    private Label lbl;
    
    private static String greeting;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        FXMLLoader loader= new FXMLLoader(getClass().getResource("saludo.fxml"));
        Parent root = (Parent)loader.load();
        Saludocontroller controller= ((Saludocontroller)loader.getController());
        controller.setStage(primaryStage);
        controller.showGreeting(greeting);
        controller.initStage(root);
        
    }

    @Override
    public void showGreeting(String message) {
        greeting = message;
        System.out.println(greeting);
        launch(message);
    }
    

    
    
}
