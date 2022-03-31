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
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

/**
 *
 * @author francois
 */
public class FxUtils {
    
    public static void setSimpleBorder(Region r,Color c,double epaisseur) {
        
        r.setBorder(new Border(new BorderStroke(c, BorderStrokeStyle.SOLID,
                CornerRadii.EMPTY, new BorderWidths(epaisseur))));
    }
    
}

