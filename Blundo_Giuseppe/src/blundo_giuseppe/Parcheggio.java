package blundo_giuseppe;

public class Parcheggio {
	private int N_Parcheggio;
	private int PostiOccupati;
	private EKey[] posti;
	public int getPostiOccupati() {
		return PostiOccupati;
	}
	public void setPostiOccupati(int postiOccupati) {
		PostiOccupati = postiOccupati;
	}
	public int getN_Parcheggio() {
		return N_Parcheggio;
	}
	public void setN_Parcheggio(int n_Parcheggio) {
		N_Parcheggio = n_Parcheggio;
	}
	public EKey getPosti(int posto) {
		return posti[posto];
	}
	public void setPosti(int posto, EKey t) {
		this.PostiOccupati++;
		this.posti[posto] = t;
	}
	public void delPosti(int posto) {
		this.PostiOccupati--;
		this.posti[posto] = null;
	}
	public Parcheggio(int n_Parcheggio) {
		super();
		N_Parcheggio = n_Parcheggio;
		PostiOccupati=0;
		posti = new EKey[100];
	}
	public int ingresso (EKey k, int wPark) throws Exception {
		if(wPark<=3&&wPark>=0);else return -4;
		if(!k.attiva())return -2;
		if(k.getPostoCorrente()==-1)return -3;
		for(int i = 0 ; i < 101 ; i++) if(this.getPosti(i)==null)return i;
		return -1;
	}
	public int uscita (EKey k, int wPark) {
		if(wPark<=3&&wPark>=0);else return -1;
		if(k.getParcheggio()!=this.getN_Parcheggio())return -2;
		for(int i = 0 ; i < 101 ; i++) if(this.getPosti(i)==k) this.delPosti(i); return 1;
	}
	public void wFull() {
		for(int i = 0 ; i < 101 ; i++) {
			if(this.getPosti(i)!=null)System.out.println(this.getPosti(i)+" Nel posto n° "+i);
		}
	}
}
