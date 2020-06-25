package x_Esempio;

public abstract class Moto implements Comparable<Moto>{
	
	protected String modello;
	protected int cilindrata;
	protected int motorizzazione; //0=due tempi 1=quattro tempi 3=elettrica
	
	
	public Moto(String modello, int cilindrata, int motorizzazione) {
		super();
		this.modello = modello;
		this.cilindrata = cilindrata;
		this.motorizzazione = motorizzazione;
	}
	
	public abstract int calcolaSconto();
	
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public int getMotorizzazione() {
		return motorizzazione;
	}
	public void setMotorizzazione(int motorizzazione) {
		this.motorizzazione = motorizzazione;
	}
	@Override
	public String toString() {
		return "modello=" + modello + ", cilindrata=" + cilindrata + ", motorizzazione=" + motorizzazione + "";
	}

	@Override
	public int compareTo(Moto o) {
		if (getMotorizzazione() == 3 && o.getMotorizzazione() == 3)	return getCilindrata()-o.getCilindrata();
		if (getMotorizzazione() == 3 && o.getMotorizzazione() != 3)	return 1;
		if (getMotorizzazione() != 3 && o.getMotorizzazione() == 3)	return -1;
		
		return getCilindrata()-o.getCilindrata();
	}
	
	

}
