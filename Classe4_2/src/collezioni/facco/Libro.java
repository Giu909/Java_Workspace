package collezioni.facco;

import java.io.Serializable;

/**
 * L'oggetto libro contiene il suo titolo ed il suo codice identificativo isbn
 * @author Faccuzz
 */
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
        return "Il libro \"" + this.titolo + "\" ha il seguente codice isbn: " + this.isbn;
    }
}
