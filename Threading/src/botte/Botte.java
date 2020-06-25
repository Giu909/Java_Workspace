package botte;

import java.util.concurrent.Semaphore;

import static java.lang.Thread.sleep;

public class Botte {
    private Semaphore sem = new Semaphore(3);
    private int botte = 3;
    private int litri = 100;

    public synchronized boolean bere(String name) {
        while (botte == 0)
            try {
                sleep((int) (Math.random()*100));
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println(name + " inizia a bere");
        botte--;
        if(litri <= 0) {
            System.out.println("Botte vuota");
            return false;
        }
        litri--;
        return true;
    }

    public synchronized boolean beve(String name) {
        try {
            if(litri >= 0) {
                sem.acquire();
                litri--;
                System.out.println(name + " inizia a bere");
                return true;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
    public synchronized void esci(String name) {
        try {
            sleep((long) (Math.random()*100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " si e' scolato tutta quella che poteva bere");
        botte--;
        notifyAll();
    }
    public synchronized void exit(String name) {
        try {
            sleep((long) (Math.random()*100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sem.release();
        System.out.println(name + " si e' scolato tutta quella che poteva bere");

    }
}
