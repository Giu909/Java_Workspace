package la_Terra_Di_Mezzo;

public class Urukhai extends Male {

	public Urukhai(int eXP) {
		super(eXP);
		this.EXP=eXP;
		this.Strenght=this.getStrenght();
		maleStrenght += this.getStrenght();
	}
	public int getStrenght() {
		return 50 + (5*this.getEXP());
	}
}
