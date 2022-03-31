/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.leneve.projet_s2_1;

/**
 *
 * @author aleneve01
 */
import javafx.scene.layout.Pane;

/**
 *
 * @author francois
 */
public class DessinPane extends Pane{
    
    private MainPanel main;
    
    public DessinPane(MainPanel main) {
        super();
        this.main = main;
      //  this.redrawAll();
    }
    
    /*public  void redrawAll() {
        this.getChildren().add(this.main.getModel().dessine());
    }*/
    
}  