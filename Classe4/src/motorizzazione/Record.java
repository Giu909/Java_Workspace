package motorizzazione;

public class Record {
	private Object[] rec = new Object[3];
	
	private static int np = 0;
	
	public Record (Persona p, Auto a) {
		rec[0] = p;
		rec[1] = a;
		rec[2] = ++np;
	}
	
	public Persona getPersona () {
		return (Persona) this.rec[0];
	}
	
	
	
}
