package la_Terra_Di_Mezzo;

public class Elfi extends Bene {

	public Elfi(int eXP) {
		super(eXP);
		this.EXP=eXP;
		this.Strenght=this.getStrenght();
		beneStrenght += this.getStrenght();
	}
	public int getStrenght() {
		int toRet;
		if(this.EXP<5)toRet = 20 + (3*this.EXP);
		else toRet = 80 + (2*this.EXP);
		return toRet;
	}
}
