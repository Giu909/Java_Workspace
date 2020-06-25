package bancomat;

public class Cliente implements Runnable{
    private Bancomat b;
    private String name;

    public Cliente(Bancomat b, String name) {
        this.b = b;
        this.name = name;
        Thread t = new Thread(this);
        t.setName(name);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int imp = (int) (Math.random() * 200 + 1);
            switch ((int) (Math.random() * 2)) {
                case 0:
                    if (!b.deposito(imp)) System.err.println("Importo non valido");
                    System.out.println(name + " Ha depositato: " + imp + " Saldo: " + b.getSaldo());
                case 1:
                    if (!b.prelievo(-imp)) System.err.println("Importo non valido");
                    System.out.println(name + " Ha prelevato: " + imp + " Saldo: " + b.getSaldo());
            }
        }
    }
}
