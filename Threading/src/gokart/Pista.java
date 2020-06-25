package gokart;

import java.util.concurrent.Semaphore;

public class Pista {
    private int spogliatoio = 2;
    private int kart = 4;

    public synchronized void enter(String nome){
        while(spogliatoio == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        spogliatoio--;
        System.out.println(nome + " entra in spogliatoio");
        notifyAll();
    }

    public synchronized void exit(String nome){
        System.out.println(nome + " ha finito di cambiarsi");
        spogliatoio++;
        notifyAll();
    }

    public synchronized void race(String nome){
        while(kart == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            kart--;
            System.out.println(nome + " entra in pista");

        notifyAll();
    }


    public synchronized void end(String nome){
        System.out.println(nome + " ha terminato la gara");
        kart++;
        notifyAll();
    }
}
