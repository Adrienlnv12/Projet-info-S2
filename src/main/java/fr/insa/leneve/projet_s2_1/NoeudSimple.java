/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.leneve.projet_s2_1;

import java.awt.Color;

/**
 *
 * @author aleneve01
 */
public class NoeudSimple extends Noeud {
    public NoeudSimple(double px, double py,Color couleur) {
        super(px,py,couleur);
    }
    
    @Override
    public String toString() {
        return "Noeud{" + "px=" + getPx() + ", py=" + getPy() + ", couleur=" + getCouleur() + '}';
    }
    
}
