package collezioni.facco;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 * Questa classe rappresenta il gestionale della biblioteca
 *
 * Per contenere i libri viene utilizzata una tabella hash che utilizza come chiave il codice isbn
 * Per i soci un albero e utilizza il codice fiscale per l'ordinamento
 * Per gestire i prestiti, invce, viene utilizzta un semplice ArrayList, così da averli ordinati in base all'ordine in cui arrivano
 *
 * L'interfaccia Serializable ha l'unico scopo di avvertire il signor java che un'oggetto può essere salvato all'interno di un file
 * (Stessa cosa anche per gli oggetti: Libro, Socio, Prestito)
 * @author Faccuzz
 */
public class Gestionale implements Serializable{
    private HashMap<String, Libro> libri = new HashMap<>();
    private TreeMap<String, Socio> soci = new TreeMap<>();
    private ArrayList<Prestito> prestiti = new ArrayList<>();

    public void addLibro(Libro l){
        libri.put(l.getIsbn(), l);
    }

    public Libro getLibro(String isbn){
        return libri.get(isbn);
    }

    public void addSocio(Socio socio){
        soci.put(socio.getCf(), socio);
    }

    public Socio getSocio(String cf){
        return soci.get(cf);
    }

    public void addPrestito(Prestito prestito){
        prestiti.add(prestito);
    }

    /**
     * Utilizza un foreach e quando trova un libro con lo stesso isbn di quello specificato lo elimina
     * @param isbn
     */
    public void deletePrestito(String isbn){
        for(Prestito p : prestiti)
            if(p.getLibro().compareToIgnoreCase(isbn) == 0) {
                prestiti.remove(p);
                break;
            }
    }

    /**
     * Questo, come anche gli altri metodi di visita, utilizzano il metodo split applicato alla String restituita
     * dal metodo toString(): Il metodo split suddivide una stringa in parti,
     * specificandone il separatore (regex).
     * è l'evoluzione della classe StringTokenizer.
     */
    public String[] visitaLibri(){
        return libri.toString().split(", ");
    }

    public String[] visitaSoci(){
        return soci.toString().split(", ");
    }

    public String[] visitaPrestiti(){
        return prestiti.toString().split(", ");
    }

}
