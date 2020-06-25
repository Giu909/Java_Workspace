package collezioni.biblioteca;

import java.io.Serializable;

public class Libro implements Serializable {
    private String titolo;
    private String isbn;

    public Libro(String titolo, String isbn) {
        this.titolo = titolo;
        this.isbn = isbn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro: " + this.titolo + " ISBN: " + this.isbn;
    }

}
