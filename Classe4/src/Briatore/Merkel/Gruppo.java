package Briatore.Merkel;

public class Gruppo {
	private String denominazione;
	private String proprietario;
	
	public Gruppo(String denominazione, String proprietario) {
		super();
		this.denominazione = denominazione;
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Gruppo [denominazione=" + denominazione + ", proprietario=" + proprietario + "]";
	}
	
	
}
