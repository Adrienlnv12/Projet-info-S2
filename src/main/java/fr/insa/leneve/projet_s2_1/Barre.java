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
public class Barre {
     
    private int id; /*g*/
    private Noeud Noeuddepart;
    private Noeud Noeudarrivee;
    private double traction;
    private double compression;
    private double prix;
    
    public Barre(Noeud Noeuddepart, Noeud Noeudarrivee/*, double traction,double compression,double prix, int id*/) {
        
        this.Noeuddepart = Noeuddepart;
        this.Noeudarrivee = Noeudarrivee;
        /*this.id=id
        this.traction = traction;
        this.compression = compression;
        this.prix = prix;*/
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Noeud getNoeuddepart() {
        return Noeuddepart;
    }

    public void setNoeuddepart(Noeud Noeuddepart) {
        this.Noeuddepart = Noeuddepart;
    }

    public Noeud getNoeudarrivee() {
        return Noeudarrivee;
    }

    public void setNoeudarrivee(Noeud Noeudarrivee) {
        this.Noeudarrivee = Noeudarrivee;
    }

    public double getTraction() {
        return traction;
    }

    public void setTraction(double traction) {
        this.traction = traction;
    }

    public double getCompression() {
        return compression;
    }

    public void setCompression(double compression) {
        this.compression = compression;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Barre{" + "id=" + id + ", Noeuddepart=" + Noeuddepart + ", Noeudarrivee=" + Noeudarrivee + ", traction=" + traction + ", compression=" + compression + ", prix=" + prix + '}';
    }

}
