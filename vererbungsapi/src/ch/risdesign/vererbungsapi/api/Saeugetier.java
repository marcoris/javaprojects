package ch.risdesign.vererbungsapi.api;

public abstract class Saeugetier extends Tier {
    private int gewicht;
    
    Saeugetier(int alter, int inventarnummer, int gewicht) {
        super(alter, inventarnummer);
        this.gewicht = gewicht;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
