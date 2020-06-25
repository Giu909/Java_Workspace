package cat;

public class Enduro extends Moto{
	
	protected String colore;
	
	public Enduro(String modello, int cilindrata, int motorizzazione,String colore) {
		super(modello, cilindrata, motorizzazione);
		this.colore=colore;
	}

	public void setColore(String colore) {
		this.colore =colore;
	}

	public String getColore() {
		return colore;
	}

	public int calcolaSconto() {
		if(super.motorizzazione==0)
			return 200;
		if(super.motorizzazione==1)
			return 150;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Enduro ["+super.toString()+"colore=" + colore + calcolaSconto()+"]";
	}
	
	

	
	
	
	
	
}
