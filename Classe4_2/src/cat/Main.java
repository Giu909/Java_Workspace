package cat;

public class Main {
	static Catalogo l = new Catalogo();
	public static void main(String[] args) {
		System.out.println("Catalogo moto");
		for(int i = 1 ; i < 3 ; i++)
			l.add(new Enduro("Model",100,i,"Rosso"), 2);
		
		for(int i = 1 ; i < 3 ; i++)
			l.add(new Scooter("Model",100,i,"Grande"), 1);
		
		for(int i = 1 ; i < 3 ; i++)
			l.add(new Stradali("Model",100,i,"Integrale"), 0);
		
		l.list();
	}

}
