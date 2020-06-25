package listaOrdinata;

/*
 * Nodo conserva l'informazione di una String
 */
public class Nodo implements Comparable<Nodo>{
	String info;
	Nodo link;
	
	public Nodo(Nodo o){
		super();
		this.info = new String(o.info);
		this.link = o.link;
	}
	
	public Nodo(String info) {
		super();
		this.info = info;
		this.link = null;
	}
	
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public Nodo getLink() {
		return link;
	}
	public void setLink(Nodo link) {
		this.link = link;
	}
	
	public boolean equals(Nodo o) {
		return this.info.equalsIgnoreCase(o.getInfo());
	}
	
	public int compareTo(Nodo o){
		return this.info.compareToIgnoreCase(o.getInfo());
	}
}
