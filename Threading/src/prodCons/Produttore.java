package prodCons;
/**
 * 
 * @author Giuseppe
 *
 */
public class Produttore implements Runnable {
	private Scambio sc;

	public Produttore(Scambio sc) {
		this.sc = sc;
		Thread t = new Thread(this);
		t.start();
	}

	/**
	 * Metodo run() che genera un valore e richiede che venga inserito nella variabile di scambio
	 */
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			int nr = (int) (Math.random()*100)+1;
			System.out.println("Set scambio: "+nr);
			sc.Set(nr);
		}
	}
}