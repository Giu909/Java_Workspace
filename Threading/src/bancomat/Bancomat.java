package bancomat;

public class Bancomat {
    private int saldo = 5000;

    public synchronized boolean prelievo (int imp) {
        if(imp > saldo) return false;
        saldo += imp;
        return true;
    }

    public synchronized boolean deposito (int imp) {
        saldo += imp;
        return true;
    }

    public synchronized int getSaldo() {
        return saldo;
    }
}
