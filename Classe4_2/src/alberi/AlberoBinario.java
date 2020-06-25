package alberi;
/**
 * Albero Binario di ricerca di chiavi intere
 * 
 * @author flavio
 *
 */
public class AlberoBinario {
	private Nodo root;

	public AlberoBinario() {
		super();
		this.root = null;
	}
/**
 * interfaccia public per la visita:
 * restituisce l'elenco ordinato dei nodi in una String
 */
	public String visita() {
		if (root == null)
			return "null";
		else
			return visita(root);
	}
	
/**
 * visita simmetrica del sottoalbero individuato da p
 * @param p
 */
	private String visita(Nodo p) {
		if (p == null) return "";
		return visita(p.getSx()) +" "+ p.getInfo()+" "+visita(p.getDx());
	}

/**
 * aggiunge un nodo di chiave k all'albero
 * @param k
 */
	public void add(int k) {
		if (root == null) {
			root = new Nodo(k);
			return;
		} else
			add(root, k);
	}
	
/**
 * aggiunge un nodo di chiave k al sottoalbero individuato dal reference p
 * @param p
 * @param k
 */	
	private void add(Nodo p, int k) {
		if (p.getInfo() == k)
			return;
		else if (p.getInfo() > k) {
			if (p.getSx() == null)
				p.setSx(new Nodo(k));
			else
				add(p.getSx(), k);
		} 
		else {
			if (p.getDx() == null)
				p.setDx(new Nodo(k));
			else
				add(p.getDx(), k);
		}
	}
	
/**
 * verifica la presenza della chiave k nell'albero
 * @param k
 * @return true se presente
 */
	public boolean find(int k){

		Nodo p = find(root, k);
		if (p == null) return false;
		else return true;
	}
	
/**
 * cerca la chiave k nel sottoalbero individuato dal reference q	
 * @param q
 * @param k
 * @return	un reference al nodo individuato
 */
	private Nodo find(Nodo q, int k){
		if (q == null) {
			return null;
		}
		if (q.getInfo() == k) {
			return q;
		}
		else if (q.getInfo()>k) {
			return find(q.getSx(),k);
		}
		else {
			return find(q.getDx(), k);
		}
	}
/**
 * Cancella il nodo contenente la chiave k
 * vengono considerati 3 casi a seconda che il nodo contenente la chiave k sia:
 * a) una foglia
 * b) un nodo con un solo figlio
 * c) un nodo con 2 figli
 * @param k la chiave da cancellare
 * @return false se chiave non presente
 */
	public boolean delete(int k){
		Nodo p = find(root, k);
		if (p == null) return false; // chiave non presente
		if (p.getDx() == null && p.getSx() == null) deleteLeaf(p);
		else if (p.getDx() == null || p.getSx() == null) deleteNode(p);
		else deleteFull(p);
		return true;
	}
	
/**
 * trova il nodo che contiene la più piccola delle chiavi maggiori della chiave contenuta nel nodo di partenza. 
 * Si assume che il nodo di partenza ha 2 figli.
 * @param deleting: nodo di partenza che andrà cancellato
 * @return
 */
	private Nodo findNearest(Nodo deleting){
		Nodo p  =  deleting.getDx(); // andiamo sulle chiavi maggiori
		while (p.getSx() != null) p = p.getSx(); //cerchiamo la più a sinistra (la più piccola)
		return p;
	}
	
	
/**
 * cancella un nodo che ha 2 figli non null
 * scelta di vita: il suo contenuto sarà sostituito dalla minore delle sue chiavi maggiori
 * @param q nodo da cancellare
 *
 */
	private void deleteFull(Nodo q){
		Nodo succ = findNearest(q);
		int saveKey = succ.getInfo();
		// è noto che succ ha figlio sx null
		if (succ.getDx() == null ) deleteLeaf(succ); // è una foglia
		else deleteNode(succ);		// è un nodo intermedio
		q.setInfo(saveKey); 	// la nuova chiave che sostituisce quella da cancellare
	}
	
	
/**
 * cancella un nodo intermedio che ha un solo figlio
 * @param q il nodo da cancellare
 *
 */
	private void deleteNode(Nodo q){
		if (q == root){
			if (q.getDx() != null) root = q.getDx();
			else root = q.getSx();
			return;
		}
		else {
			Nodo prec = findParent(root,q);
			Nodo mySubTree;
			if (q.getDx() == null) mySubTree = q.getSx();
			else mySubTree = q.getSx();
			if (prec.getDx() == q) prec.setDx(mySubTree);
			else prec.setSx(mySubTree);
		}
	}
	
/**
 * cancella la foglia individuata dal reference q	
 * @param q
 * 
 */
	private void deleteLeaf(Nodo q){
		if (q == root) {
			root = null;
			}
		else {
			int key = q.getInfo();
			Nodo prec = findParent(root, q);
			if (prec.getDx() == q) prec.setDx(null);
			else prec.setSx(null);
		}
	}
/**
 * restituisce un reference al nodo padre del nodo target	
 * @param q Nodo di partenza della ricerca
 * @param target Nodo di cui si cerca il padre
 * @return
 */
	private Nodo findParent(Nodo q, Nodo target){
		int key = target.getInfo();
		if (q == null) return null; // ??? potrebbe?
		if (q.getDx()==target || q.getSx()==target) return q;
		else if (q.getInfo()> key) return findParent(q.getSx(), target);
		else return findParent(q.getDx(), target);
	}
	
	@Override
	public String toString() {
		return visita();
	}
	
	
}
