package ch.risdesign.vererbungsapi;

import ch.risdesign.vererbungsapi.api.*;
import ch.risdesign.vererbungsapi.ausnamen.MetzgerException;

public class Bauernhof {
    public static void main(String[] args) {
//        Arraybeispiele
        Gefluegel[] huehnerstall = new Gefluegel[3];
        huehnerstall[0] = new Gefluegel(1, 4711, true);
        huehnerstall[1] = new Gefluegel(2, 666, false);
        huehnerstall[2] = new Gefluegel(3, 42, true);
        
        Schwein[] schweinestall = {
            new Schwein(10, 111, 85, "Hausschwein"),
            new Schwein(9, 101, 95, "Wildschwein")
        };
        
        System.out.println("Die Inventarnummer von Huhn3: " + huehnerstall[2].getInventarnummer());
        System.out.println("Der Typ vom Schwein 1: " + schweinestall[0].getTyp());
        schweinestall[0].lautGeben();
        
        try {
            schweinestall[0].tobeornottobe();
            System.out.println("Och nee");
        } catch (MetzgerException e) {
            System.out.println(schweinestall[0].getInventarnummer() + " sagt \"Tschüss und danke für alles\"");
            schweinestall[0] = null;
        }
        
        try {
            schweinestall[1].tobeornottobe();
            System.out.println("Ich denk nicht dran");
        } catch (MetzgerException e) {
            System.out.println(schweinestall[1].getInventarnummer() + " sagt \"Wenn es denn sein muss :-(\"");
            schweinestall[1] = null;
        }
        System.out.println("Das Leben auf dem Bauernhof geht weiter");
        
//        Methodenaufrufe mit Exceptions
//        Gefluegel huhn1 = new Gefluegel(1, 123, true);
//        Gefluegel huhn2 = new Gefluegel(2, 456, false);
//        Gefluegel huhn3 = new Gefluegel(2, 789, true);
//        
//        Mensch mann = new Mensch(43, "Schmitt", "Bauer");
//        Mensch frau = new Mensch(40);
//        
//        Schwein piggy = new Schwein(10, 1122, 85, "Hausschwein");
//        Schwein ferkel = new Schwein(9, 3344, 85, "Wildschwein");
//        
//        Schaf mani = new Schaf(5, 2233, 17, 0);
//        
//        System.out.println("Die Inventarnummer von Huhn3: " + huhn3.getInventarnummer());
//        System.out.println("Der Typ vom piggy: " + piggy.getTyp());
//        piggy.lautGeben();
//        try {
//            piggy.tobeornottobe();
//            System.out.println("Och nee");
//        } catch (MetzgerException e) {
//            System.out.println(piggy.getInventarnummer() + " sagt \"Tschüss und danke für alles\"");
//            piggy = null;
//        }
//        try {
//            ferkel.tobeornottobe();
//            System.out.println("Ich denk nicht dran");
//        } catch (MetzgerException e) {
//            System.out.println(ferkel.getInventarnummer() + " sagt \"Wenn es denn sein muss :-(\"");
//            ferkel = null;
//        }
//        
//        System.out.println("Das Leben auf dem Bauernhof geht weiter");
        
    }
}
