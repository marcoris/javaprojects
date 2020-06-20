package multithreading;

public class ZweiterThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("*** Thread 2 ist aktiv");
            
            try {
                sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
