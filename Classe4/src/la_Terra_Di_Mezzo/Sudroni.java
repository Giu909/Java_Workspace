package la_Terra_Di_Mezzo;

public class Sudroni extends Male {

	public Sudroni(int eXP) {
		super(eXP);
		this.EXP=eXP;
		this.Strenght=this.getStrenght();
		maleStrenght += this.getStrenght();
	}
	public int getStrenght() {
		return 40 + (5*this.getEXP());
	}
}
