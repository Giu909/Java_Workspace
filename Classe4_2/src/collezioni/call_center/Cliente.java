package collezioni.call_center;

public class Cliente {
    private String n;
    private String c;
    private String i;
    private String ci;

    public Cliente(String nome, String cognome, String indirizzo, String citta) {
        this.n = nome;
        this.c = cognome;
        this.i = indirizzo;
        this.ci = citta;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return " ";
    }
}
