package collezioni.facco;

import java.io.Serializable;

/**
 * L'oggetto Prestito contiene la coppia (codice libro; codice richiedente)
 * per semplicità  codice libro = libro e codice richiedente = socio
 * @author Faccuzz
 */
public class Prestito implements Serializable {
    private String libro;
    private String socio;

    public Prestito(String libro, String socio) {
        this.libro = libro;
        this.socio = socio;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    @Override
    public String toString() {
        return "Il libro con codice \"" + this.libro + "\" è stato prestato al socio con codice " + this.socio;
    }
}
