/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import model.ModelFactory;
import ui.View;
import ui.ViewFactory;
import ui.ViewJavaFXImplementation;

/**
 * Controlador de la ventana que muestra el saludo
 * @author Diego
 */
public class Saludocontroller {

    @FXML
    private Pane panel;
    @FXML
    private Label lbl_saludo;
    @FXML
    private Stage stage;
    
    private String greeting;
    
   
    
   protected static final Logger LOGGER = Logger.getLogger("/application/SaludoController");
   /**
     * Método initiStage, se encarga la ventana y de su ejecución
     * @param root    
     */
   public void initStage(Parent root) {
        // TODO
        LOGGER.info("Initializing the greeting visual interface");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Saludo"); 
        lbl_saludo.setStyle("-fx-aligment: center-right");
        lbl_saludo.setStyle("-fx-font-size: 50px");
        lbl_saludo.setText(greeting);
        stage.show();
    }    
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    
    public void showGreeting(String message) {
        this.greeting = message;
    }
    
    
    

    
   
}
