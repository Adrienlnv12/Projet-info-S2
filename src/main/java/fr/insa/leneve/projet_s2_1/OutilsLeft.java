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
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 *
 * @author francois
 */
public class OutilsLeft extends VBox{
    
    private ToggleButton bSelect;
    private ToggleButton bPoint;
    private ToggleButton bSegment;
    
    public OutilsLeft() {
        this.bSelect = new ToggleButton("select");
        this.bPoint = new ToggleButton("point");
        this.bSegment = new ToggleButton("segment");
        
        ToggleGroup gBoutons = new ToggleGroup();
        this.bSelect.setToggleGroup(gBoutons);
        this.bPoint.setToggleGroup(gBoutons);
        this.bSegment.setToggleGroup(gBoutons);
        
        this.getChildren().addAll(this.bSelect,this.bPoint,this.bSegment);
        FxUtils.setSimpleBorder(this, Color.CYAN, 2);
        
    }
    
}  

