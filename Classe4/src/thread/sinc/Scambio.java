package thread.sinc;

public class Scambio {
	private static int scambio;
	private static boolean occ=false;
	
	public Scambio() {
		super();
	}

	public synchronized int getScambio() {
		while(!occ)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		occ=false;
		System.out.println("Consumatore: "+scambio);
		return scambio;
	}

	public synchronized void setScambio() {
		while(!occ)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		occ=true;
		scambio = (int) (Math.random()*100);
		System.out.println("Produttore: "+scambio);
	}
}
