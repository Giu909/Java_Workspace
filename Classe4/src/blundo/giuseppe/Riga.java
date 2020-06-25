package blundo.giuseppe;

public class Riga {
	private Prodotto prodotto;
	private int qt;
	
	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public int getQt() {
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}

	public Riga(Prodotto prodotto, int qt) {
		super();
		this.prodotto = prodotto;
		this.qt = qt;
	}
	
}
