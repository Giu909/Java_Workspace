package collezioni.biblioteca;

import java.io.Serializable;

public class Prestito implements Serializable {
    private Libro libro;
    private Socio socio;

    public Prestito(Libro libro, Socio socio) {
        this.libro = libro;
        this.socio = socio;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return this.libro + " Prestato a: " + this.socio;
    }
}
