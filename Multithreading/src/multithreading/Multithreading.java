package multithreading;

public class Multithreading {
    public static void main(String[] args) {
        ErsterThread a = new ErsterThread();
        ZweiterThread b = new ZweiterThread();
        VierterThread c = new VierterThread();
        a.start();
        b.start();
        c.start();
    }
}
