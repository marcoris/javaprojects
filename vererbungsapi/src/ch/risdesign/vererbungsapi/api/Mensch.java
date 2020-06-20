package ch.risdesign.vererbungsapi.api;

public class Mensch extends Lebewesen {
    private String name;
    private String beruf;
    
    public Mensch(int alter) {
        super(alter);
    }
    
    public Mensch(int alter, String name, String beruf) {
        super(alter);
        this.name = name;
        this.beruf = beruf;
    }
    
    public void telefonieren() {
        System.out.println("Hallo - ist dort...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBeruf() {
        return beruf;
    }
}
