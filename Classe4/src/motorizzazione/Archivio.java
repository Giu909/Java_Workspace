package motorizzazione;

public class Archivio {
	private Record[] archivio = new Record[100];
	
	public void add (Record r) {
		for(int i = 0 ; i < archivio.length;i++)
			if(archivio[i]==null) {archivio[i]=r;break;}
	}
	
	public Record[] get (Persona p) {
		Record[] toret = new Record[100];
		for(int i = 0; i < archivio.length; i++) 
			if(archivio[i].getPersona().equals(p))toret[i]=archivio[i];
		return toret;
	}

	public Archivio() {
		super();
	}
}