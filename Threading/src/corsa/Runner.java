package corsa;
/**
 * 
 * @author Giuseppe
 *
 */
public class Runner implements Runnable{
	private int distanceMax = 100;
	static int pos = 0;
	private int distance; 
	private String name;

	public Runner(String nome) {
		this.name = nome;
		Thread t = new Thread(this,nome);
		t.start();
	}

	/**
	 * Metodo run() eseguito dal Thread una volta avviato
	 * Genera un numero random e va avanzare il runner, se non arriva a destinazione genera un altro numero random e fa aspettare il Runner
	 */
	@Override
	public void run() {
		while(true) {
			this.distance += (int) (Math.random()*20)+1;
			if(this.distance < this.distanceMax)
				try {
					Thread.sleep((long) ((Math.random()*20)+1));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			else{
				res();
				break;
			}
		}
	}
	/**
	 * Metodo per assegnare la posizione di arrivo
	 * La firma riporta la dicitura synchronized perché permette a un solo Runner alla volta di accedere al metodo, in questo modo non si hanno possibilità di errore
	 */
	private synchronized void res() {
		System.out.println(name+" Arrived: "+pos++);
	}
}