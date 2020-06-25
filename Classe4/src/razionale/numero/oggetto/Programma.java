package razionale.numero.oggetto;
import java.util.Scanner;
public class Programma {
	
	@SuppressWarnings("resource")
	public static void main (String args[]) throws Exception {
		Scanner kbd = new Scanner(System.in);
		int num = 0;
		int den = 1;
		boolean errato;
		do {
			System.out.println("Inserire un razionale col quale eseguire varie operazioni:\n");
			do {
				System.out.println("Numeratore --> ");
				try {
					num = kbd.nextInt();
					errato = false;
				}catch(Exception e) {
					System.out.println("Numero non valido\n");
					errato = true;
				}
			}while(errato);

			do {
				System.out.println("Denominatore --> ");
				try {
					den = kbd.nextInt();
					errato = false;
				}catch(Exception e) {
					System.out.println("Numero non valido\n");
					errato = true;
				}
			}while(errato);
			Razionale r = new Razionale(num,den);
			System.out.println(r);
			System.out.println("Si scelga una delle sequenti scelte:\n"
					+ "1  --> MOSTRA il numero razionale corrente;\n"
					+ "2  --> SOMMA con un numero intero;\n"
					+ "3  --> SOMMA con un numero razionale\n"
					+ "4  --> PRODOTTO per un numero intero;\n"
					+ "5  --> PRODOTTO per un numero razionale;\n"
					+ "6  --> DIVISIONE per un numero intero;\n"
					+ "7  --> DIVISIONE per un numero razionale;\n"
					+ "8  --> RECIPROCO del numero selezionato;\n"
					+ "9  --> Cambia numero razionale principale;"
					+ "10 --> Esci dal programma;");
			int scelta = kbd.nextInt();
			switch(scelta) {
			case 1 :
				
			}
		}while(true);
	}
	
}
