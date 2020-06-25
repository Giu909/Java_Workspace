package collezioni.biblioteca;

import java.io.Serializable;

public class Socio implements Serializable {
    private String nome;
    private String cf;

    public Socio(String nome, String cf) {
        this.nome = nome;
        this.cf = cf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    @Override
    public String toString() {
        return " Socio: " + this.nome + " CF: " + this.cf;
    }
}
