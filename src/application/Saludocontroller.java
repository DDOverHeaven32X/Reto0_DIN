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
import ui.View;
import ui.ViewJavaFXImplementation;

/**
 * Controlador de la ventana que muestra el saludo
 *
 * @author Diego
 */
public class Saludocontroller implements View  {

    @FXML
    private Pane panel;
    @FXML
    private Label lbl_saludo;
    private Stage stage;
    private String saludo = "HOLA MUNDO";
    //protected static final Logger LOGGER = Logger.getLogger("/application/SaludoController");

   public void initStage(Parent root) {
        // TODO
        //LOGGER.info("Initializing the greeting visual interface");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Saludo"); 
        showGreeting(saludo);
        stage.show();
    }    
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void showGreeting(String message) {
        lbl_saludo.setText(message);
    }
    
    
    

    
   
}
