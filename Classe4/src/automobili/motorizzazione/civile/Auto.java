package automobili.motorizzazione.civile;

import java.io.Serializable;
@SuppressWarnings({ "unused", "serial" })
public class Auto implements Serializable{
	private String modello;
	private String targa;
	
	//crea un auto partendo dal modello e dalla targa
	public Auto(String modello, String targa) {
		super();
		this.modello = modello;
		this.targa = targa;
	}
	
	//costruttore copia
	public Auto(Auto a) {
		super();
		this.modello = a.modello;
		this.targa = a.targa;
	}
	
	public String getModello() {
		return modello;
	}
	
	public void setModello(String modello) {
		this.modello = modello;
	}
	
	public String getTarga() {
		return targa;
	}
	
	public void setTarga(String targa) {
		this.targa = targa;
	}
	
	@Override
	public String toString() {
		return "L'auto con targa " + targa + " è il modello " + modello;
	}
}
