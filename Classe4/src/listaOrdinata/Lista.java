package listaOrdinata;

public class Lista {
	Nodo head = null;

	public Lista() {
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
			toReturn += q.getInfo() + " ";
			q = q.getLink();
		} while (q != null);
		return toReturn.trim();
	}

	public void insert(String info){
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

	/**
	 * elimina un nodo dalla lista
	 * 
	 * @param info  : contenuto del nodo da cancellare
	 */
	public void delete(String info) {
		if (head == null)
			return;
		if (head.getInfo().equalsIgnoreCase(info)) {
			head = head.getLink();
			return;
		}
		Nodo p = head;
		Nodo pPrec = null;
		while ((p != null) && (!p.getInfo().equalsIgnoreCase(info))) {
			pPrec = p;
			p = p.getLink();
		}
		if (p == null)
			return;
		if (p.getInfo().equalsIgnoreCase(info)) {
			pPrec.setLink(p.getLink());
		}
	}

	public boolean isSubList(Lista o) {
		if (o == null)
			throw new NullPointerException();
		if (this.head == null)
			return false;
		if (o.head == null)
			return true;
		Nodo p = this.head;
		Nodo q = o.head;
		Nodo pPrec = null;

		while (p != null && q != null) {
			while (p != null && !p.getInfo().equals(q.getInfo()))
				p = p.getLink();
			if (p == null) return false;
			pPrec = p;
			while (p != null && q!= null && p.getInfo().equals(q.getInfo())){
				p = p.getLink();
				q = q.getLink();
			}
			if (p == null && q != null) return false;
			if (q == null) return true;
			p = pPrec.getLink();
			q = o.head;
		}
		return false;
	}//:~ isSubList
	
	@Override
	public String toString() {
		return this.visita();
	}

	
	
}
