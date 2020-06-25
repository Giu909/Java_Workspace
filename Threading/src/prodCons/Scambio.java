package prodCons;
/**
 * 
 * @author Giuseppe
 *
 */
public class Scambio {
	private static int val;
	private static boolean occ;

	public Scambio() {
		super();
		Scambio.occ = false;
	}

	/**
	 * Metodo che imposta il valore della variabile di scambio
	 * @param nr valore da impostare
	 */
	public synchronized void Set(int nr) {
		while(occ)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		Scambio.val = nr;
		Scambio.occ = true;
		System.out.println("Done setting!");
		notifyAll();
	}

	/**
	 * Metodo che restituisce il valore della variabile di scambio
	 * @return valore della variabile di scambio
	 */
	public synchronized int Get() {
		while(!occ)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		Scambio.occ = false;
		System.out.println("Done getting!");
		notifyAll();
		return val;
	}
}