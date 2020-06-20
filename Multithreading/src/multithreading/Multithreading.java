package multithreading;

public class Multithreading {
    public static void main(String[] args) {
        ErsterThread a = new ErsterThread();
        ZweiterThread b = new ZweiterThread();
        a.start();
        b.start();
    }
}
