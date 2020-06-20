package multithreading;

public class DritterThread extends Thread {
    long erg;
    public void run() {
        while(true) {
            erg++;
            if (isInterrupted()) {
                System.out.println("***** Erster Thread unterbrochen *****");
                break;
            }
        }
    }
}
