package collezioni.biblioteca;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Biblioteca implements Serializable {
    private HashMap<String, Libro> libri = new HashMap<>();
    private TreeMap<String, Socio> soci = new TreeMap<>();
    private ArrayList<Prestito> prestiti = new ArrayList<>();

    public Libro addLibro (Libro l ) {
        libri.put(l.getIsbn(), l);
        return l;
    }

    public Libro getLibro (String isbn) {
        return libri.get(isbn);
    }

    public Socio addSocio (Socio s) {
        soci.put(s.getCf(), s);
        return s;
    }

    public Socio getSocio(String cf){
        return soci.get(cf);
    }

    public void addPrestito(Prestito prestito){
        prestiti.add(prestito);
    }

    public void deletePrestito(String isbn){
        for(Prestito p : prestiti)
            if(p.getLibro().getIsbn().compareToIgnoreCase(isbn) == 0 ) {
                prestiti.remove(p);
                break;
            }
    }

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
