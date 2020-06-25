package automobili.motorizzazione.civile;

import java.io.IOException;
@SuppressWarnings("unused")
public class Programma {

	public static void main(String[] args) throws IOException {
		Persona bella = new Persona ("Davide Facco","FCCDVD02");
		Auto tesla = new Auto ("Model x","FD0220DF");
		Record figo = new Record(bella,tesla);
		
		Persona brutta = new Persona ("Piergiorgio Toniolo","PGRTNL02");
		Auto vintage = new Auto ("Pandino","PT0220TP");
		Record onesto = new Record (brutta,vintage);
		
		Archivio a = new Archivio();
//		a.addRecord(figo);
//		a.addRecord(onesto);
//		
//		a.salva();
		System.out.println("salvato");
		System.out.println(a.getLista()[0] + "\n\n" + a.getLista()[1]);
	}

}
