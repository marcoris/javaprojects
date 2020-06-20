package ch.risdesign.vererbungsapi;
import ch.risdesign.vererbungsapi.api.Gefluegel;
import ch.risdesign.vererbungsapi.api.Schaf;
import ch.risdesign.vererbungsapi.api.Schwein;

public class Bauernhof {
    public static void main(String[] args) {
        Gefluegel huhn1 = new Gefluegel();
        Gefluegel huhn2 = new Gefluegel();
        Gefluegel huhn3 = new Gefluegel();
        
        Schwein piggy = new Schwein();
        
        Schaf mani = new Schaf();
        
        huhn1.alter = 3;
        huhn2.geschlecht = true;
        huhn3.inventarnummer = 42;
        
        piggy.inventarnummer = 7;
        piggy.typ = "Hausschwein";
        
        mani.inventarnummer = 123;
        mani.geschlecht = 2;
        
        System.out.println(huhn3.inventarnummer);
        System.out.println(piggy.typ);
    }
}
