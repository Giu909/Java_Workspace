package collezioni.esempio;

public class Main {

	public static void main(String[] args) {
		Libro b = new Libro("ISBN1","I promessi...");
		System.out.println(b);
		Socio s = new Socio("CF1","Pinco Palla ..");
		System.out.println(s);
		
		Prestito p = new Prestito("ISBN","CF");
		System.out.println(p);
		
		Biblioteca bb = new Biblioteca();
		bb.addLibro(b);
		System.out.print(bb.getLibro("ISBN1"));
		
		bb.addSocio(s);
		
		System.out.print(bb.getSocio("CF1"));
		
	}

}
