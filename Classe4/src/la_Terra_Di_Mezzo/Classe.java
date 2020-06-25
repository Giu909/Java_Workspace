package la_Terra_Di_Mezzo;

public class Classe {
	protected int EXP;
	protected int Strenght;
	
	public Classe(int eXP) {
		super();
		EXP = eXP;
		
	}
	public int getEXP() {
		return EXP;
	}
	public void setEXP(int eXP) {
		EXP = eXP;
	}
	public int getStrenght() {
		return Strenght;
	}
	public void setStrenght(int strenght) {
		Strenght = strenght;
	}
	@Override
	public String toString() {
		return "Classe [EXP=" + EXP + ", Stenght=" + Strenght + "]";
	}
//	public int fight(Classe c) {
//		if(this.getStrenght()-c.getStrenght()==0)return 1;
//		if(this.getStrenght()-c.getStrenght()<0)return 0;
//		else return 2;
//	}
//	public int rndFight(Classe c) {
//		
//	}
}
