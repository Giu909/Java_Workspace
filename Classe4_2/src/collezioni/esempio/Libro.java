package collezioni.esempio;

public class Libro {
	private String ISBN;
	private String altro;
	
	public Libro(String iSBN, String altro) {
		super();
		ISBN = iSBN;
		this.altro = altro;
	}

	public Libro(Libro o) {
		super();
		ISBN = o.ISBN;
		this.altro = o.altro;
	}
	
	
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAltro() {
		return altro;
	}

	public void setAltro(String altro) {
		this.altro = altro;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", altro=" + altro + "]";
	}

}
