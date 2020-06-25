package cat;

public class Nodo {
	
	private Moto info;
	private Nodo link;
	
	public Nodo(Moto info) {
		super();
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

	public void setLink(Nodo dx) {
		this.link = dx;
	}
	
	@Override
	public String toString() {
		return " "+info;
	}
	
	public boolean compareTo(Nodo p) {
		return this.getInfo().compareTo(p.getInfo());
	}

	public void add (Nodo p) {
		while(true) {
			if(this.getLink()==null) {
				this.setLink(p);
				return;
			}
			this.setLink(this.getLink());
		}
	}
}
