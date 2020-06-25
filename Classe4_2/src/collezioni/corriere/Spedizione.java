package collezioni.corriere;

public class Spedizione {
    private String code;
    private String send;
    private String rec;
    private Terminale t;

    public Spedizione(String code, String send, String rec, Terminale t) {
        this.code = code;
        this.send = send;
        this.rec = rec;
        this.t = t;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Cliente getSend() {
        return t.getCli(send);
    }

    public void setSend(String send) {
        this.send = send;
    }

    public Cliente getRec() {
        return t.getCli(rec);
    }

    public void setRec(String rec) {
        this.rec = rec;
    }

    @Override
    public String toString() {
        return "Spedizione numero: "+this.code+" Info mittente: "+this.getSend()+" Info destinatario: "+this.getRec();
    }
}
