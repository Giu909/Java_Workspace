package automobili.motorizzazione.civile;

import java.io.Serializable;
import java.util.Arrays;
@SuppressWarnings({ "unused", "serial" })
public class Record implements Serializable{
	

	//contiene l'auto, la persona associata ad essa ed il numero di pratica
	private Object[] info = new Object[3];
	
	//np = numero di pratica; Static poichÃ¨ tiene il conto di tutti i numeri di pratica di tutti i Record
	private static int np = 0;
	/**
	 * Costruttore del Record:
	 * info[0] --> Contiene le informazioni della Persona proprietaria della macchina
	 * info[1] --> Contiene le informazione di un' Auto
	 * info[2] --> Continete il numero di pratica del Record
	 * @param a
	 * @param p
	 */
	public Record(Persona p , Auto a) {
		super();
		info[0] = p;
		info[1] = a;
		info[2] = ++np;
	}
	
	public Record (Record r) {
		super();
		info[0] = r.getPersona();
		info[1] = r.getAuto();
		info[2] = r.getNp();
	}
	//Torna le info dell'auto
	public Auto getAuto() {
		return (Auto)info[1];
	}
	//Torna le info del proprietario
	public Persona getPersona() {
		return (Persona) info[0];
	}
	//Torna il numero di pratica
	public int getNp() {
		return (int) info[2];
	}
	
	public boolean equals (Record r) {
		if (info[0] == r.getAuto()) 
			if(info[1] == r.getPersona()) 
				if((int)info[2] == r.getNp()) return true;
		return false;
			
	}
	
	@Override
	public String toString() {		
		return "A questo record è associato il nominativo " + getPersona().getNominativo() + " e la rispettiva auto " + getAuto().getModello() + ".\nNumero di pratica: " + getNp();
	
	}
}
