package x_Esempio;

public class Catalogo {
	Nodo head = null;

	public Catalogo() {
		this.head = null;
	}

	/**
	 * 
	 * @return una String che contiene tutti i nodi della lista o null se la
	 *         lista è null
	 */
	private String visita() {
		if (this.head == null)
			return null;
		Nodo q = this.head;
		String toReturn = "";
		do {
			toReturn += q.getInfo() + "\n";
			q = q.getLink();
		} while (q != null);
		return toReturn.trim();
	}

	public void insert(Moto info){
		this.insert(new Nodo(info));
	}
	
	/**
	 * Inserisce in modo ordinato un nodo nella lista
	 * 
	 * @param p : nodo da inserire
	 */
	private void insert(Nodo p) throws NullPointerException {
		if (p == null)
			throw new NullPointerException("nuovo nodo è null");
		// caso lista vuota
		if (this.head == null) {
			this.head = p;
			return;
		}
		// caso inserimento in testa
		if (p.compareTo(this.head) <= 0) {
			p.setLink(this.head);
			this.head = p;
		} else {
			Nodo q = this.head;
			Nodo qPrec = null;
			while ((q != null)&&(q.compareTo(p) < 0)) {
				qPrec = q;
				q = q.getLink();
			}
			// caso inserimento in coda
			if (q == null) {
				qPrec.setLink(p);
				p.setLink(null);
			} else {
				p.setLink(q);
				qPrec.setLink(p);
			}
		}
	}

	

	
	
	@Override
	public String toString() {
		return this.visita();
	}

	
	
}
