package motorizzazione;

import java.util.Scanner;

public class Main {
	static boolean test = false;
	static boolean load = true;
	static Scanner kbd = new Scanner (System.in);
	public static void main(String[] args) {
		System.out.println("Benvenuti nell'applicativo gestionale della motorizzazione civile.");
		boolean x = true;
		while(x) {
			System.out.println("\nSelezionare un opzione dal seguente menu'");
			System.out.println("Opzioni:\n"
					+ "1) Nuova auto\n"
					+ "2) Ricerca auto\n"
					+ "3) Quit...");
			System.out.print("Selezione: ");
			int a = kbd.nextInt();
			switch(a) {
			case 1:
				System.out.println("New Auto");
				//newAuto();//Menu' inserimento nuova auto
				break;
			case 2:
				System.out.println("Find");
				//find();//Sottomenu' ricerca
				break;
			case 3:
				System.out.println("Salvataggio delle impostazioni...");
				saving();
				System.out.println("Uscita in corso...");
				System.exit(0);
				break;
			case 4:
				System.out.println("Debug");
				//debug();//Debug options
				break;
			default:
				System.out.println("Selezione non corretta");
			}
		}
	}
	public static void debug() {
		System.out.print("Debug Option:\n"
				+ "1) caricamento auto da memoria\n"
				+ "2) inserimento auto d'esempio nell'archivio al lancio\n"
				+ "3) Quit..."
				+ "Selezione: ");
		int f = kbd.nextInt();
		switch (f) {
		case 1: 
			System.out.print("Le auto che vengono salvate in memoria rimangono permanenti anche dopo la terminazione del programma\n "
					+ "Stato: ");
			if(load)System.out.println("Attivo");
			else System.out.println("Non attivo");
			System.out.print("Nuovo stato? (T/F)? ");
			String sel = kbd.next();
			if(sel=="T"&&sel=="t")load=true;
			else load=false;
			break;
		case 2:
			System.out.print("Verranno caricate in memoria delle auto di test visualizzabili tramite il comando list\n Stato: ");
			if(test)System.out.println("Attivo");
			else System.out.println("Non attivo");
			break;
		}
	}
	@SuppressWarnings("unused")
	public static void find() {
		System.out.print("Selezionare un'opzione dall'elenco\n"
				+ "1) Ricerca auto per nome proprietario\n"
				+ "2) Ricerca auto per numero targa\n"
				+ "3) Ricerca auto per modello\n"
				+ "4) Ricerca auto per numero pratica\n"
				+ "5) Quit menu'\n");
		System.out.print("Selezione: ");
		int s = kbd.nextInt();
		switch(s) {
		case 1:
			System.out.print("Nome proprietario: ");
			String n = kbd.next();
			//TODO Finire opzioni
		}
	}
	@SuppressWarnings("unused")
	public static void newAuto() {
		System.out.print("Targa: ");
		String targ = kbd.next();
		System.out.print("Modello: ");
		String model = kbd.next();
		System.out.print("Nome proprietario: ");
		String nome = kbd.next();
		System.out.print("CF: ");
		String cf = kbd.next();
		Record tre = new Record(new Persona(nome, cf), new Auto(model, targ));
		
	}
	public static void saving() {
	
		//TODO metodo per il salvataggio sui file e creazione file desiderati
		
	}
}
