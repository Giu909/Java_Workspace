package prodConsBuffer;
/**
 * 
 * @author Giuseppe
 *
 */
public class Consumatore implements Runnable{
	private Buffer buffer;

	public Consumatore(Buffer buffer) {
		this.buffer = buffer;
		Thread t = new Thread(this);
		t.start();
	}

	/**
	 * Metodo run() che scrive a schermo il valore richiesto al buffer
	 */
	@Override
	public void run() {
		for(int i=0; i<20; i++)
			System.out.println("Dato letto: "+buffer.read());
	}
}