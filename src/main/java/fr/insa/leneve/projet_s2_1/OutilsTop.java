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
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;


/**
 *
 * @author francois
 */
public class OutilsTop extends HBox {
    
    private ColorPicker couleur;
    private Button zoomIn;
    private Button zoomOut;
    
    public OutilsTop() {
        this.couleur = new ColorPicker(Color.BLACK);
        this.zoomIn = new Button("Zoom *2");
        this.zoomOut = new Button("Zoom /2");
        
        this.getChildren().add(this.couleur);
        this.getChildren().add(this.zoomIn);
        this.getChildren().add(this.zoomOut);
        
    }
    
    
}
