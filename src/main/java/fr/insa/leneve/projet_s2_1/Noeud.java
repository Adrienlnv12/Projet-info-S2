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
public abstract class Noeud {
    
    private double px;
    private double py;
    private Color couleur;
    
    public Noeud(double px, double py,Color couleur) {
        this.couleur = couleur;
        this.px = px;
        this.py = py;
    }
    public Noeud(double px, double py) {
        this(px,py,Color.BLACK);
        
    }
    public Noeud() {
        this(0,0);
    }

    public double getPx() {
        return px;
    }

    public void setPx(double px) {
        this.px = px;
    }

    public double getPy() {
        return py;
    }

    public void setPy(double py) {
        this.py = py;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }
    
    public static Noeud entreeNoeud(){
        int Rep=3;
        System.out.println("Donnez l'abscisse de votre noeud");
        double Px=Lire.d();
        System.out.println("Donnez l'ordonnée de votre noeud");
        double Py=Lire.d();
        while (Rep==3){
            System.out.println("Donnez son type");
            System.out.println("Tapez 0 pour un noeud simple");
            System.out.println("Tapez 1 pour un appui simple");
            System.out.println("Tapez 2 pour un appui double");
            Rep=Lire.i();
            if((Rep!=1)&&(Rep!=2)&&(Rep!=0)){
                System.out.println("Donnez un nombre compris entre 0 et 2");
                Rep=3;
            }
        }
        switch (Rep) {
            case 0 -> {
                System.out.println("Le type de noeud est un noeud simple");
                return new NoeudSimple(Px,Py,Color.BLACK);
            }
            case 1 -> {
                System.out.println("Le type de noeud est un appui simple");
                return new NoeudAppuiSimple(Px,Py,Color.BLACK);
            }
            case 2 -> {
                System.out.println("Le type de noeud est un appui double");
                return new NoeudAppuiDouble(Px,Py,Color.BLACK);
            }
            default -> {
            }
        }
        return null;    
    }
   /* public int nbrInconnues(){
        
        return couleur;
    }*/
    

}
