package collezioni.esempio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class Biblioteca {
	
	private HashMap<String, Libro> libri 	= new HashMap<>();
	private TreeMap<String, Socio> soci		= new TreeMap<>();
	private ArrayList<Prestito>    prestiti	= new ArrayList<>();
	
	
	
	public Libro getLibro(String isbn){
		return new Libro(libri.get(isbn));
	}
	
	
	public void addLibro(Libro l){
		libri.put(l.getISBN(), new Libro(l));
	}
	
	public Socio getSocio(String aCF){
		return new Socio(soci.get(aCF));
	}
	
	public void addSocio(Socio c){
		soci.put(c.getCF(), new Socio(c));
	}
}
