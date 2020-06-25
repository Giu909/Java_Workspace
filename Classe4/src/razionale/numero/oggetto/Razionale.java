package razionale.numero.oggetto;

public class Razionale {
	
	private int numeratore;
	private int denominatore;
	
	public Razionale(int numeratore, int denominatore) throws Exception {
		super();
		this.numeratore = numeratore;
		setDenominatore(denominatore);
		fattorizza();
	}

	public int getNumeratore() {
		return numeratore;
	}

	public void setNumeratore(int numeratore) {
		this.numeratore = numeratore;
	}

	public int getDenominatore() {
		return denominatore;
	}

	public void setDenominatore(int denominatore) throws Exception {
		if (denominatore != 0) this.denominatore = denominatore;
		else throw new Exception("Razionale non istanziabile : Impossibile dividere per zero");
	}
	
	private void fattorizza() {
		for (int i = 2 ; i <= Math.min(Math.abs(numeratore),Math.abs(denominatore)); i++) 
			if((numeratore % i == 0) && (denominatore % i == 0)) {
				numeratore /= i;
				denominatore /= i;
				i--;
			}
	}

	private boolean positivo() {
		if((numeratore >= 0 && denominatore < 0) || (numeratore <= 0 && denominatore > 0)) return false;
		return true;
	}
	
	@Override
	public String toString() {
		int num = Math.abs(numeratore);
		int den = Math.abs(denominatore);
		String toRet = "  " + num + "\n" ;
		if (positivo()) toRet += "+ ";
		else toRet += "- ";
		
		String n;
		if(num > den) {
			n = "" + num;
			for(int i = 0; i < n.length() ; i++) toRet += "-";			
		}
		else {
			n = "" + den; 
			for(int i = 0; i < n.length() ; i++) toRet += "-";
		}
		toRet += "\n  " + den;
		return toRet;
	}
	
	public void somma(Razionale r){
		int mcd = this.denominatore * r.getDenominatore();
		this.numeratore = (this.numeratore * (mcd / this.denominatore)) + (r.getNumeratore() * (mcd / r.getDenominatore()));
		this.denominatore = mcd;
		fattorizza();
	}
	
	public void somma(int n){
		this.numeratore += n * this.denominatore;
		fattorizza();
	}
	
	public void prodotto(Razionale r){
		this.denominatore *= r.getDenominatore();
		this.numeratore *= r.getNumeratore();
		fattorizza();
	}
	
	public void prodotto(int n){
		this.numeratore *= n;		
		fattorizza();
	}
	
	public void divisione (Razionale r){
		r.reciproco();
		prodotto(r);
	}
	
	public void divisione (int n){
		this.denominatore *= n;
		fattorizza();
	}
	
	public void reciproco() {
		int den = this.denominatore;
		this.denominatore = this.numeratore;
		this.numeratore = den;
	}
	
	public int toInt() {
		return (int)numeratore/denominatore;
	}
	
	public float toFloat() {
		return (float)numeratore/denominatore;
	}
	
	public double toDouble() {
		return (double)numeratore/denominatore;
	}
}
