/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import model.Model;
import model.ModelFactory;
import ui.View;
import ui.ViewFactory;

/**
 *
 * @author 2dam
 */
public class Application {


    public static void main(String[] args) {
        ViewFactory viewfactory = new ViewFactory();
        View view = viewfactory.getView();
        ModelFactory modelfactory = new ModelFactory();
        Model model = modelfactory.getModel();
        Controller controller = new Controller();
        controller.run(view, model);
    }

}
