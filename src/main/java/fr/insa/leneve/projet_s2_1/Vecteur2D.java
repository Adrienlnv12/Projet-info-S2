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
public class Vecteur2D {

    private double vx;
    private double vy;
    
    public Vecteur2D(double vx, double vy) {
        this.vx = vx;
        this.vy = vy;
    }

    /**
     *
     */
    public Vecteur2D() {
        this(0,0);
    }

    public double getVx() {
        return vx;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

    @Override
    public String toString() {
        return "Vecteur2D{" + "vx=" + vx + ", vy=" + vy + '}';
    }
    
}
