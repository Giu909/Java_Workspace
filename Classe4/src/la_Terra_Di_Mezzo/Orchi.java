package la_Terra_Di_Mezzo;

public class Orchi extends Male {

	public Orchi(int eXP) {
		super(eXP);
		this.EXP=eXP;
		this.Strenght=this.getStrenght();
		maleStrenght += this.getStrenght();
	}
	public int getStrenght() {
		if(this.EXP<5) return 30+(2*this.EXP);
		else return 30+(2*this.EXP);
	}
}
