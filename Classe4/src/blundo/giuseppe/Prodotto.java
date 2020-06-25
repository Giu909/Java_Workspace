package blundo.giuseppe;

public class Prodotto {
	private String codiceAlfanumerico;
	private String breveDescrizione;
	private int prezzoVendita;
	private int iva;
	public String getCodiceAlfanumerico() {
		return codiceAlfanumerico;
	}
	public void setCodiceAlfanumerico(String codiceAlfanumerico) {
		this.codiceAlfanumerico = codiceAlfanumerico;
	}
	public String getBreveDescrizione() {
		return breveDescrizione;
	}
	public void setBreveDescrizione(String breveDescrizione) {
		this.breveDescrizione = breveDescrizione;
	}
	public int getPrezzoVendita() {
		return prezzoVendita;
	}
	public void setPrezzoVendita(int prezzoVendita) {
		this.prezzoVendita = prezzoVendita;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public Prodotto(String codiceAlfanumerico, String breveDescrizione,
			int prezzoVendita, int iva) {
		super();
		this.codiceAlfanumerico = codiceAlfanumerico;
		this.breveDescrizione = breveDescrizione;
		this.prezzoVendita = prezzoVendita;
		this.iva = iva;
	}
	public String toString() {
		return "Prodotto [codiceAlfanumerico=" + codiceAlfanumerico
				+ ", breveDescrizione=" + breveDescrizione + ", prezzoVendita="
				+ prezzoVendita + ", iva=" + iva + "]";
	}
	
	
}
