package prodCons;
/**
 * 
 * @author Giuseppe
 *
 */
public class Consumatore implements Runnable{
	private Scambio sc;

	public Consumatore(Scambio sc) {
		this.sc = sc;
		Thread t = new Thread(this);
		t.start();
	}

	/**
	 * Metodo run() che richiede il valore della variabile scambio e la scrive a schermo
	 */
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			int nr = sc.Get();
			System.out.println("Get scambio: "+nr);
		}
	}
}