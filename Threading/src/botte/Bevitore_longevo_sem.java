package botte;

public class Bevitore_longevo_sem implements Runnable{
    private Botte botte;
    private String name;

    public Bevitore_longevo_sem(Botte botte, String name) {
        this.botte = botte;
        this.name = name;
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while(botte.bere(name))
        botte.esci(name);

    }
}
