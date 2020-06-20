package ch.risdesign.vererbungsapi.api;

import ch.risdesign.vererbungsapi.ausnamen.MetzgerException;
import java.util.Random;

public final class Schwein extends Saeugetier {
    private String typ;
    
    public Schwein(int alter, int inventarnummer, int gewicht, String typ) {
        super(alter, inventarnummer, gewicht);
        this.typ = typ;
        this.setAlter(alter);
        this.setInventarnummer(inventarnummer);
    }
    
    public String getTyp() {
        return typ;
    }
    
    public void lautGeben() {
        System.out.println("Grunz");
    }
    
    public void tobeornottobe()
        throws MetzgerException {
            System.out.println("Tja, ist es Zeit für den Metzger?");
            if (new Random().nextInt(50) < 20) {
                throw new MetzgerException();
            }
        }
}
