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
import javafx.scene.layout.BorderPane;

/**
 *
 * @author francois
 */
public class MainPanel extends BorderPane {

    /**
     * @return the model
     */
    
    private OutilsTop outilsTop;
    private OutilsLeft outilsLeft;
    private DessinPane dessin;
    
    public MainPanel() {
        this.outilsTop = new OutilsTop();
        this.outilsLeft = new OutilsLeft();
        this.dessin = new DessinPane(this);
        
        this.setTop(this.outilsTop);
        this.setLeft(this.outilsLeft);
        this.setCenter(this.dessin);
    }
    
}
