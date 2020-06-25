package prodCons;
/**
 * 
 * @author Giuseppe
 *
 */
public class Main {

	public static void main(String[] args) {
		Scambio sc = new Scambio();
		new Produttore(sc);
		new Consumatore(sc);
	}
}
