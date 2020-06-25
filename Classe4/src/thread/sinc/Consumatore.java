package thread.sinc;

public class Consumatore extends Thread{
	Scambio sc = new Scambio();
	public void run() {
		for(int i= 0;i<10;i++)
		sc.setScambio();
		
	}
}
