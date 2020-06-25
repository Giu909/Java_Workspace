package alberi;
/**
 * Nodo per un albero binario contenente l'informazione di un int
 * 
 * @author flavio
 *
 */
public class Nodo {
	private int info;
	private Nodo sx;
	private Nodo dx;
	
	public Nodo(int info) {
		super();
		this.info = info;
		this.sx = null;
		this.dx = null;
	}

	public int getInfo() {
		return info;
	}

	public void setInfo(int info) {
		this.info = info;
	}

	public Nodo getSx() {
		return sx;
	}

	public void setSx(Nodo sx) {
		this.sx = sx;
	}

	public Nodo getDx() {
		return dx;
	}

	public void setDx(Nodo dx) {
		this.dx = dx;
	}
}
