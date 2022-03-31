/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.leneve.projet_s2_1;
import javafx.application.Application ; 
import javafx.scene.Scene ; 
import javafx.scene.control.Label ;
import javafx.stage.Stage ;
/**
 *
 * @author aleneve01
 */
public class Interface extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception { 
    // l'objet stage permet de créer une fenêtre 
        Scene sc = new Scene(new Label ("le coup du petit juif"));
        primaryStage.setScene(sc) ; 
        primaryStage.show() ; 
    }
    public static void main(String[] args) {
        launch(args);
    }
}
