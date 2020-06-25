package x_Esempio;

public class Stradali extends Moto {

	private String carena;
	
	public Stradali(String modello, int cilindrata, int motorizzazione,String carena) {
		super(modello, cilindrata, motorizzazione);
		this.carena=carena;
	}
	
	public int calcolaSconto() {
		if(super.cilindrata<=250)
			return 0;
		int sxCilindrata=(super.cilindrata-250)/10;
		int sconto=150+(15*sxCilindrata);
		return sconto;
	}
	
	public String getCarena() {
		return carena;
	}
	public void setCarena(String carena) {
		this.carena = carena;
	}

	@Override
	public String toString() {
		return "Stradali ["+super.toString()+" carena=" + carena +" sconto ="+calcolaSconto()+ "]";
	}
/**
 *  si suppone il seguente ordine di lista Stradali << Scooter << Enduro
 */
	@Override
	public int compareTo(Moto o) {
		if ( o instanceof Stradali)
			return super.compareTo(o);
		else return -1;
	}
	
	
	
	

	
	
	
	
}
