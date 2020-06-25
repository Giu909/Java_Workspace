package concerto;

public class Cliente implements Runnable{
    private Biglietteria b;
    private String name;

    public Cliente(Biglietteria b, String name) {
        this.b = b;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {

    }
}
