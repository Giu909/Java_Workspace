package la_Terra_Di_Mezzo;

public class Uomini extends Bene{

	public Uomini(int eXP) {
		super(eXP);
		this.EXP=eXP;
		this.Strenght=this.getStrenght();
		beneStrenght += this.getStrenght();
	}
	public int getStrenght() {
		return 30 + (6*this.getEXP());
	}
}
