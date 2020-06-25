package cat;

public abstract class Moto {
	
	protected String modello;
	protected int cilindrata;
	protected int motorizzazione; //1) Due tempi; 2) Quattro tempi; 3) Elettrica
	
	
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
	public boolean compareTo (Moto p) {
		if(this.getCilindrata()==p.getCilindrata()&&this.getModello().compareToIgnoreCase(this.getModello())==0&&this.getMotorizzazione()==p.getMotorizzazione())
			return true;
		return false;
	}
	@Override
	public String toString() {
		return "modello=" + modello + ", cilindrata=" + cilindrata + ", motorizzazione=" + motorizzazione + "";
	}

	
	

}
