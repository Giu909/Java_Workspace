package x_Esempio;

public class Nodo implements Comparable<Nodo>{
	
	private Moto info;
	private Nodo link;
	
	public Nodo(Moto info) {
		this.info=info;
		this.link = null;
	}

	public Moto getInfo() {
		return info;
	}

	public void setInfo(Moto info) {
		this.info = info;
	}

	public Nodo getLink() {
		return link;
	}

	public void setLink(Nodo link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return ""+info;
	}

	@Override
	public int compareTo(Nodo o) {
		return getInfo().compareTo(o.getInfo());
	}
	
	

}
