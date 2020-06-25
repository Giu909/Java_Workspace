package automobili.motorizzazione.civile;

import java.io.Serializable;
@SuppressWarnings({ "unused", "serial" })
public class Persona implements Serializable{
	private String nominativo;
	//codice fiscale
	private String cf;
	
	//crea una persona con il nominativo ed il codice fiscale
	public Persona(String nominativo, String cf) {
		super();
		this.nominativo = nominativo;
		this.cf = cf;
	}
	
	//costruttore copia
	public Persona(Persona a) {
		super();
		this.nominativo = a.nominativo;
		this.cf = a.cf;
	}
	
	public String getNominativo() {
		return nominativo;
	}

	public void setNominativo(String nominativo) {
		this.nominativo = nominativo;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	@Override
	public String toString() {
		return "Il signore/a con nome " + nominativo + " ha il seguente codice fiscale: " + cf;
	}
}
