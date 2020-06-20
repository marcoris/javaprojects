package ch.risdesign.vererbungsapi.api;

import ch.risdesign.vererbungsapi.ausnamen.MetzgerException;
import java.util.Random;

public final class Schaf extends Saeugetier {
    private int geschlecht;
    
    public Schaf(int alter, int inventarnummer, int gewicht, int geschlecht) {
        super(alter, inventarnummer, gewicht);
        this.geschlecht = geschlecht;
        this.setInventarnummer(inventarnummer);
        this.setGewicht(gewicht);
    }
    
    public int getMilch() {
        if (this.geschlecht < 1) return 0;
        else return 10;
    }
    
    public int getWolle() {
        return 0;
    }
    
    public void lautGeben() {
        System.out.println("Määäh!");
    }
    
    public void tobeornottobe()
        throws MetzgerException {
            System.out.println("Tja, ist es Zeit für den Metzger?");
            if (new Random().nextInt(50) < 40) {
                throw new MetzgerException();
            }
        }
}
