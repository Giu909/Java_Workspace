package collezioni.biblioteca;

public class Main {

    public static void main(String[] args) {
        Biblioteca b = new Biblioteca();

        for(int i = 0 ; i < 10 ; i++) {
            b.addPrestito(new Prestito(b.addLibro(new Libro("Titolo" + i, "Isbn" + i)),b.addSocio(new Socio("Nome"+i, "CF"+i))));
        }

        System.out.println("Libri: ");

        for(String s : b.visitaLibri())
            System.out.println(s.subSequence(6, s.length()) + "\n--");

        System.out.println("Soci: ");

        for(String s : b.visitaSoci())
            System.out.println(s.subSequence(5, s.length()) + "\n--");

        System.out.println("Prestiti: ");

        for(String s : b.visitaPrestiti()){
            if(s.charAt(0) == '[') System.out.println(s.subSequence(0, s.length()) + "\n--");
            else System.out.println(s + "\n--");
        }
        System.out.println("Cancello il primo prestito");
        b.deletePrestito("Isbn0");

        for(String s : b.visitaPrestiti()){
            if(s.charAt(0) == '[') System.out.println(s.subSequence(0, s.length()) + "\n--");
            else System.out.println(s + "\n--");
        }

        Backup.backup(b);
    }
}
