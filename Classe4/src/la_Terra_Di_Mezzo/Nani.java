package la_Terra_Di_Mezzo;

public class Nani extends Bene {

	public Nani(int eXP) {
		super(eXP);
		this.EXP=eXP;
		this.Strenght=this.getStrenght();
		beneStrenght += this.getStrenght();
	}
	public int getStrenght() {
		return 20 + (4*this.getEXP());
	}
}
