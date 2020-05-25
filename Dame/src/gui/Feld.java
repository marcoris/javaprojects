/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author mctes
 */
public class Feld extends javax.swing.JButton {
    private Brett brett;
    private boolean istSchwarz;
    
    public Feld(Brett brett, boolean schwarz) {
        this.brett = brett;
        istSchwarz = schwarz;
    }
}
