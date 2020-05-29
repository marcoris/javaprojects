/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import root.*;

/**
 *
 * @author mctes
 */
public class Feld extends javax.swing.JButton {
    private Brett brett;
    private Stein stein = null;
    private boolean istSchwarz;
    private int zeile;
    private int spalte;
    
    public Feld(Brett brett, boolean schwarz, int zeile, int spalte) {
        this.brett = brett;
        istSchwarz = schwarz;
        this.zeile = zeile;
        this.spalte = spalte;
    }
    
    public int getZeile() {
        return zeile;
    }
    
    public int getSpalte() {
        return spalte;
    }
    
    public void setStein(Stein stein) {
        setStein(stein, false);
    }

    public void setStein(Stein stein, boolean init) {
        if (!init && stein.getClass().getCanonicalName().equals("root.Einfach") &&
           (zeile == 0 || zeile == 9)
        ) {
            stein = new Dame(this, stein.getSchwarz());
        }
        this.stein = stein;
        stein.setFeld(this);
        setForeground(stein.getSchwarz() ? Color.black : Color.white);
        this.setFont(new java.awt.Font("Dialog", 0, 40));
        setText(stein.getSymbol());
    }
    
    public Brett getBrett() {
        return brett;
    }
    
    public Stein getStein() {
        return stein;
    }
    
    public void wegStein() {
        stein = null;
        brett.merkeBeginn();
        setText("");
    }
}
