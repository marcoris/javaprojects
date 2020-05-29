/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import gui.*;
/**
 *
 * @author mctes
 */
public class Einfach extends Stein {
    public Einfach(Feld feld, boolean istSchwarz) {
        super(feld, istSchwarz);
    }
    
    public boolean istOk(Feld feld) {
        int dx = feld.getSpalte() - getFeld().getSpalte();
        int dy = feld.getZeile() - getFeld().getZeile();
        
        if (Math.abs(dx) != Math.abs(dy)) {
            return false;
        } else if (Math.abs(dx) == 0 ||
                    Math.abs(dx) > 2) {
            return false;
        } else if (getSchwarz() && dy > 0 ||
                !getSchwarz() && dy < 0) {
            return false;
        }
        
        return true;
    }
    
    public String getSymbol() {
        return "\u25ce";
    }
}
