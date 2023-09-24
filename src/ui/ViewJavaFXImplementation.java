/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


import application.Main;
import excepciones.EmptyFileException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;


/**
 * Implementacion de la vista, enseña el mensaje desde una interfáz grafica
 * @author Diego
 */
public class ViewJavaFXImplementation extends javafx.application.Application implements View {
    
    @FXML
    private Label lbl;

    @Override
    public void showGreeting(String message) {
        lbl.setText(message);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main main = null;
        main.start(primaryStage);
    }

    
    
}
