package Briatore.Merkel;
@SuppressWarnings("unused")
public class Impiegato {
	private String cognome;
	private String nome;
	private String nazionalita;
	private int anzianita;
	private int stipendioBase = 500;
	private int stipendioMensile;
	
	public Impiegato(String cognome, String nome, String nazionalita, int anzianita, int stipendioBase) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.nazionalita = nazionalita;
		this.anzianita = anzianita;
		this.stipendioBase = stipendioBase;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNazionalita() {
		return nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}

	public int getAnzianita() {
		return anzianita;
	}

	public void setAnzianita(int anzianita) {
		this.anzianita = anzianita;
	}

	public int getStipendioBase() {
		return stipendioBase;
	}

	public void setStipendioBase(int stipendioBase) {
		this.stipendioBase = stipendioBase;
	}

	@Override
	public String toString() {
		return "Impiegato [cognome=" + cognome + ", nome=" + nome + ", nazionalita=" + nazionalita + ", anzianita="
				+ anzianita + ", stipendioBase=" + stipendioBase + "]";
	}
	
	public void stipendioMensile() {
		stipendioMensile = stipendioBase+50*anzianita;
	}
}
