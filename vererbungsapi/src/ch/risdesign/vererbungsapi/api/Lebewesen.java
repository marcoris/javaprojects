package ch.risdesign.vererbungsapi.api;

public class Lebewesen {
    private int alter;
    Lebewesen(int alter) {
        super();
        this.alter = alter;
    }
    
    public int getAlter() {
        return alter;
    }
    
    public void setAlter(int alter) {
        this.alter = alter;
    }
}
