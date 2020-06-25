package prodConsBuffer;
/**
 * 
 * @author Giuseppe
 *
 */
public class Buffer {
	private int readIndex = 0, writeIndex = 0;
	protected int[] b = new int[5];

	/**
	 * Metodo che inserisce nell'attuale posizione libera del buffer il valore
	 * @param dato valore da inserire nel buffer
	 */
	public synchronized void write(int dato) {
		while((writeIndex + 1) % this.b.length == readIndex) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		b[writeIndex] = dato;
		writeIndex = (writeIndex + 1) % this.b.length;
		notifyAll();
	}

	/**
	 * Metodo che restituisce il valore del buffer non ancora elaborato
	 * @return valore del buffer
	 */
	public synchronized int read() {
		while((readIndex + 1) % this.b.length == writeIndex) {
			try {
				wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		int dato = b[readIndex];
		readIndex = (readIndex + 1) % this.b.length;
		notifyAll();
		return dato;
	}
}