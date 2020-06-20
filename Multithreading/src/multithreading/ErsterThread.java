package multithreading;

public class ErsterThread extends Thread {
    public void run() {
        while(true) {
            System.out.println("Das kommt aus Thread 1 ***");
            
            try {
                sleep(300);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
