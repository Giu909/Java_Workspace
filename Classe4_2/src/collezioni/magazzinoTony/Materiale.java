package collezioni.magazzinoTony;

import java.io.Serializable;

public class Materiale implements Serializable {
    private int imp;
    private int qua;
    private String desc;

    public Materiale(int imp, int qua, String desc) {
        this.imp = imp;
        this.qua = qua;
        this.desc = desc;
    }

    public void setImp(int imp) {
        this.imp += imp;
    }

    public int getImp() {
        return imp;
    }

    public void setQua(int qua) {
        this.qua += qua;
    }

    public int getQua() {
        return qua;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void revrite(Materiale x) {
        this.imp = x.imp;
        this.qua = x.qua;
    }
    @Override
    public String toString() {
        return " Materiale [" + "Prezzo = " + imp + "; Quantità = " + qua + "; Descrizione = " + desc + "]";
    }


}
