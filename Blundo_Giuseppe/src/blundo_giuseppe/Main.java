package blundo_giuseppe;

import java.util.Scanner;
@SuppressWarnings("unused")
public class Main {
	static Scanner kbd = new Scanner(System.in);
	public static void main(String[] args) {
		EKey[] k = new EKey [1];
		Parcheggio[] p = new Parcheggio[4];
		p[0]=new Parcheggio(0);
		p[1]=new Parcheggio(1);
		p[2]=new Parcheggio(2);
		p[3]=new Parcheggio(3);
		boolean x = true;
		while(x) {
			System.out.print("Gestione parcheggio (By Giu909)/n"
					+ "Funzioni:/n"
					+ "1) Creazione EKey/n"
					+ "2) Ingresso auto in Parcheggio/n"
					+ "3) Uscita auto da parcheggio/n"
					+ "4) Disponibilità parcheggi/n"
					+ "5) Utilizzatori attuali del parcheggio/n"
					+ "6) Uscita dal programma/n"
					+ "Selezione --> ");
			int s = kbd.nextInt();
			switch(s) {
			case 1:
				System.out.print("Inserire nome del cliente -->");
				String nome = kbd.next();
				System.out.print("Durata della scheda -->");
				long time = kbd.nextLong();
				EKey chiave = new EKey(nome, time);
				
				break;
			case 2:
				
				break;
			case 4:
				System.out.print("Numero parcheggio? -->");
				int n = kbd.nextInt();
				System.out.println(p[n].getPostiOccupati());
				break;
			case 5:
				System.out.print("Inserire n° parcheggio -->");
				int a = kbd.nextInt();
				p[a].wFull();
				break;
			case 6:
				x=false;
			}
		}

	}
	public static void add (EKey k1) {
		
	}

}
