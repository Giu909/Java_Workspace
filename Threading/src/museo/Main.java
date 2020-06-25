package museo;
/**
 * 
 * @author Giuseppe
 *
 */
public class Main {

	public static void main(String[] args) {
		Museo m = new Museo(5);
		for(int i = 0; i < 10; i++)
			new Turista(m,i);
	}
}
