package Briatore.Merkel;

public class Struttura {
	private String denominazione;
	private String tipologia;
	private String sede;
	
	public Struttura(String denominazione, String tipologia, String sede) {
		super();
		this.denominazione = denominazione;
		this.tipologia = tipologia;
		this.sede = sede;
	}

	@Override
	public String toString() {
		return "Struttura [denominazione=" + denominazione + ", tipologia=" + tipologia + ", sede=" + sede + "]";
	}
	
	
	
}
