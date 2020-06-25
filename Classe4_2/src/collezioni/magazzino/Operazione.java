package collezioni.magazzino;

import java.io.Serializable;

public class Operazione implements Serializable {
    private static int sq = 0;
    private int code;
    private int q;
    private int p;
    private String desc;

    public Operazione(int q, int p, String desc) {
        this.q = q;
        this.p = p;
        this.code = sq++;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }

    public int getP() {
        return p;
    }

    public void setP(int p) {
        this.p = p;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Operazione {" + "Codice = " + code + ", Quantità = " + q + ", Prezzo = " + p + '}';
    }

    public int compareTo (Operazione x) {
        return desc.compareToIgnoreCase(x.desc);
    }
}
