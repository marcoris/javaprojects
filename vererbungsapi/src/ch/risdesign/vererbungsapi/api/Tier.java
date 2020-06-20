package ch.risdesign.vererbungsapi.api;

import ch.risdesign.vererbungsapi.schnittstellen.ITierable;

public abstract class Tier extends Lebewesen implements ITierable {
    private int inventarnummer;
    Tier(int alter, int inventarnummer) {
        super(alter);
        this.inventarnummer = inventarnummer;
    }

    public int getInventarnummer() {
        return inventarnummer;
    }

    public void setInventarnummer(int inventarnummer) {
        this.inventarnummer = inventarnummer;
    }
}
