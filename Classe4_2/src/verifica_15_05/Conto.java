package verifica_15_05;

public class Conto {
    private static int count;
    private int id;
    private int idC;
    private double preSaldo;
    private double saldo;
    private int fido;
    private int move;

    public Conto(int idC) {
        this.id = count++;
        this.idC = idC;
        this.saldo = 0;
        this.fido = 2000;
        this.move = 0;

    }

    /*
    Con questo metodo mi faccio dare il saldo ad inizio mese
     */
    public double getPreSaldo() {
        double toRet = preSaldo;
        preSaldo = saldo;
        return toRet;
    }

    public double getSaldof() {
        return saldo+fido;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
        this.move += saldo;
    }

    public int getMove() {
        return move;
    }

    /*
    Con questo metoco controllo che due conti siano uguali, come vedrai dentro Gestionale lo uso molto spesso
     */
    public int compareTo(Conto x) {
        if(this.id == x.id) return 0;
        return 2;
    }

    @Override
    public String toString() {
        return "Conto{" +
                "id=" + id +
                " idC=" + idC +
                " saldo=" + saldo +
                " fido=" + fido +
                '}';
    }

}
