package concerto;

import java.util.concurrent.Semaphore;

public class Biglietteria {
    private int b = 100;
    private Semaphore semaphore = new Semaphore(5);

    public synchronized boolean in() {
        try {
            semaphore.acquire();
            if(semaphore.availablePermits() == 0) System.out.println("Nessuna bigliettaria disponibile");
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
