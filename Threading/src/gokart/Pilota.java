package gokart;

import static java.lang.Thread.sleep;

public class Pilota implements Runnable{
    private Pista pista;
    private String name;

    public Pilota(Pista pista, String name) {
        this.name = name;
        this.pista = pista;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        pista.enter(name);
        try {
            sleep((int)(Math.random()*100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pista.exit(name);

        pista.race(name);

        for (int i = 0 ; i < 15 ; i++){
            try {
                sleep((int)(Math.random()*100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        pista.end(name);

        pista.enter(name);
        try {
            sleep((int)(Math.random()*100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        pista.exit(name);

    }
/*
    private void sleepy() {
        try {
            sleep((int)(Math.random()*100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    */
}
