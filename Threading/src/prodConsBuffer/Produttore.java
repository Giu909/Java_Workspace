package prodConsBuffer;
/**
 * 
 * @author Giuseppe
 *
 */
public class Produttore implements Runnable{
	private Buffer buffer;

	public Produttore(Buffer buffer) {
		this.buffer = buffer;
		Thread m = new Thread(this);
		m.start();
	}

	/**
	 * Metodo run() che genera un numero lo scrive a schermo e richiede che venga inserito nel buffer
	 */
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			int nr = (int) (Math.random()*100)+1;
			System.out.println("Dato prodotto: "+nr);
			buffer.write(nr);
		}
	}
}