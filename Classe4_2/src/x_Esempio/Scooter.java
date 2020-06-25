package x_Esempio;

public class Scooter extends Moto{

	private String bauletto;

	public Scooter(String modello, int cilindrata, int motorizzazione, String bauletto) {
		super(modello, cilindrata, motorizzazione);
		this.bauletto = bauletto;
	}
	
	public int calcolaSconto() {
		if(super.motorizzazione==0)
			return 300;
		if(super.motorizzazione==1)
			return 250;
		else
			return 200;
		
	}

	public String getBauletto() {
		return bauletto;
	}

	public void setBauletto(String bauletto) {
		this.bauletto = bauletto;
	}

	@Override
	public String toString() {
		return "Scooter ["+super.toString()+" bauletto=" + bauletto + ", sconto="+calcolaSconto()+ "]";
	}

	
	/**
	 *  si suppone il seguente ordine di lista Stradali << Scooter << Enduro
	 */
	@Override
	public int compareTo(Moto o) {
		if (o instanceof Scooter)
			return super.compareTo(o);
		else if (o instanceof Stradali)
			return 1;
		else
			return -1;
	}

	
	
	
	
	
	
}
