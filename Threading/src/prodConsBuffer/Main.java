package prodConsBuffer;
/**
 * 
 * @author Giuseppe
 *
 */
public class Main {

	public static void main(String[] args) {
		Buffer t = new Buffer();
		new Produttore(t);
		new Consumatore(t);
	}
}