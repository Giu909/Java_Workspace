package collezioni.esempio;

public class Prestito {
	private String aISBN;
	private String aCF;
	
	public Prestito(String aISBN, String aCF) {
		super();
		this.aISBN = aISBN;
		this.aCF = aCF;
	}
	@Override
	public String toString() {
		return "Prestito [ISBN=" + aISBN + ", CF=" + aCF + "]";
	}
	
	
}
