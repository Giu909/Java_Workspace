package thread.sinc;

public class Produttore extends Thread{
	Scambio sc = new Scambio();
	public void run() {
		for(int i=0;i<10;i++)
		sc.getScambio();
	}
}
