package ch.risdesign.vererbungsapi;

import ch.risdesign.vererbungsapi.api.*;
import ch.risdesign.vererbungsapi.ausnamen.MetzgerException;

public class Bauernhof {
    public static void main(String[] args) {
        Gefluegel huhn1 = new Gefluegel(1, 123, true);
        Gefluegel huhn2 = new Gefluegel(2, 456, false);
        Gefluegel huhn3 = new Gefluegel(2, 789, true);
        
        Mensch mann = new Mensch(43, "Schmitt", "Bauer");
        Mensch frau = new Mensch(40);
        
        Schwein piggy = new Schwein(10, 1122, 85, "Hausschwein");
        Schwein ferkel = new Schwein(9, 3344, 85, "Wildschwein");
        
        Schaf mani = new Schaf(5, 2233, 17, 0);
        
        System.out.println("Die Inventarnummer von Huhn3: " + huhn3.getInventarnummer());
        System.out.println("Der Typ vom piggy: " + piggy.getTyp());
        piggy.lautGeben();
        try {
            piggy.tobeornottobe();
            System.out.println("Och nee");
        } catch (MetzgerException e) {
            System.out.println(piggy.getInventarnummer() + " sagt \"Tschüss und danke für alles\"");
            piggy = null;
        }
        try {
            ferkel.tobeornottobe();
            System.out.println("Ich denk nicht dran");
        } catch (MetzgerException e) {
            System.out.println(ferkel.getInventarnummer() + " sagt \"Wenn es denn sein muss :-(\"");
            ferkel = null;
        }
        
        System.out.println("Das Leben auf dem Bauernhof geht weiter");
        
    }
}
