package multithreading;

public class VierterThread extends Thread {
    DritterThread c = new DritterThread();
    
    public void run() {
        c.start();
        
        while(true) {
            System.out.println(c.erg);
            
            if (c.erg > 1000) {
                c.interrupt();
                break;
            }
        }
    }
}
