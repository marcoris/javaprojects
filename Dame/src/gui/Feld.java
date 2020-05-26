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
    
    public Feld(Brett brett, boolean schwarz) {
        this.brett = brett;
        istSchwarz = schwarz;
    }
    
    public void setStein(Stein stein) {
        this.stein = stein;
        stein.setFeld(this);
        setForeground(stein.getSchwarz() ? Color.black : Color.white);
        setText("O");
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
