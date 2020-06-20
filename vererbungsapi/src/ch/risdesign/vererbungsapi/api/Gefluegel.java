package ch.risdesign.vererbungsapi.api;

public final class Gefluegel extends Tier {
    private boolean geschlecht;
    
    public Gefluegel(int alter, int inventarnummer, boolean geschlecht) {
        super(alter, inventarnummer);
        this.geschlecht = geschlecht;
        this.setInventarnummer(inventarnummer);
        this.setAlter(alter);
    }
    
    public int getEi() {
        if (this.geschlecht == true) return 0;
        else return 1;
    }
    
    public boolean isGeschlecht() {
        return geschlecht;
    }
    
    public final void lautGeben() {
        System.out.println("Gack, gack, gack");
    }
    
    public void tobeornottobe() {
        System.out.println("Ich hinterfrage mich doch nicht");
    }
}
