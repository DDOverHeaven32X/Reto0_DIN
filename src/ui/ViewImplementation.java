/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *  Implementación de la vista, enseña el mensaje desde la consola
 * @author Diego
 */
public class ViewImplementation implements View {
    
    @Override
    public void showGreeting(String message) {
        System.out.println(message);
    }
    
}
