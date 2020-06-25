package thread.sinc;

public class Main {
	static Scambio sc = new Scambio();
	public static void main(String[] args) {
//		Produttore p = new Produttore();
//		Consumatore c = new Consumatore();
//		p.start();
//		c.start();
		sc.setScambio();
		sc.getScambio();
	}

}
