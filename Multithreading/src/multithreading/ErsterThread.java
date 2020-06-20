package multithreading;

public class ErsterThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("Das kommt aus Thread 1 ***");
        }
    }
}
