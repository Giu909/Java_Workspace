package collezioni.multe;

public class Automobile {
    private String targa;
    private String modello;
    private String CF;

    public Automobile(String targa, String modello, String CF) {
        this.targa = targa;
        this.modello = modello;
        this.CF = CF;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "targa='" + targa + '\'' +
                ", modello='" + modello + '\'' +
                ", CF='" + CF + '\'' +
                '}';
    }
}
