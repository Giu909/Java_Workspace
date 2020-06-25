package museo;
/**
 * 
 * @author Giuseppe
 *
 */
public class Turista implements Runnable{
	private String name;
	private Museo m;

	public Turista(Museo m, int name) {
		this.name = "Tourist n° "+name;
		this.m = m;
		Thread t = new Thread(this);
		t.start();
	}

	/**
	 * Metodo run che tenta l'accesso al museo ogni quanto di tempo generato casualmente
	 */
	@Override
	public void run() {
		while(true) {
			if(m.goIn(this.name)) {
				System.out.println(this.name + " entra al museo");
				try {
					Thread.sleep((int)(Math.random())*100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				m.goOut();
				System.out.println(this.name + " esce dal museo");
				break;
			}
		}
	}
}
