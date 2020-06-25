package blundo.giuseppe;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Prodotto p1 = new Prodotto("1","Carta",10,22);
		Prodotto p2 = new Prodotto("2","Penna",5,22);
		Prodotto p3 = new Prodotto("3","Matita",6,22);
		Prodotto p4 = new Prodotto("4","Tovagliolo",3,22);
		Fattura f = new Fattura(LocalDate.now(), "Nome");
		f.list();
		f.add(p1, 10);
		f.add(p2, 2);
		f.add(p3, 5);
		f.add(p4, 8);
		f.list();
		if(f.remove(p2))System.out.println("Canc exe correctly"); else System.out.println("Cancellazione non eseguita");;
		f.list();
		System.out.println("Prezzo: "+f.imponibile()+" Di cui iva: "+f.qtiva()+" Per un totale di: "+f.tot());
	}

}
