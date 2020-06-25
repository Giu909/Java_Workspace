package x_Esempio;

public class Main {

	public static void main(String[] args) {
		Catalogo catalogo = new Catalogo();
		
		catalogo.insert(new Scooter("Sc1", 100, 0, "grande"));
		catalogo.insert(new Enduro("E1", 200, 3, "bianco"));
		catalogo.insert(new Enduro("E2", 300, 1, "rosso"));
		catalogo.insert(new Scooter("Sc2", 500, 3, "no"));
		catalogo.insert(new Enduro("E3", 100, 0, "nero"));
		catalogo.insert(new Enduro("E4", 200, 1, "blu"));
		catalogo.insert(new Stradali("St1", 250, 3, "sì"));
		catalogo.insert(new Stradali("St2", 280, 0, "sì"));
		System.out.println(catalogo);

	}

}
