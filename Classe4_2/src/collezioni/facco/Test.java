package collezioni.facco;

/**
 * Classe di test
 * @author Faccuzz
 */
public class Test {

    public static void main(String[] args){
        Gestionale gest = new Gestionale();
        //gest = Util.restore();

       // /*
        Libro l1 = new Libro("titolone", "esq23");
        Libro l2 = new Libro("questo è un titolo", "e4rt58");
        Libro l3 = new Libro("olotit", "ind431");
        Libro l4 = new Libro("metasploit", "exmsf5");

        Socio s1 = new Socio("davide",  "fccdvd");
        Socio s2 = new Socio("pierobobby",  "prbbby");
        Socio s3 = new Socio("moretto",  "mrtsmn");
        Socio s4 = new Socio("viz",  "vzxsmn");
        Socio s5 = new Socio("de nadai",  "dndng");

        Prestito p1 = new Prestito(l1.getIsbn(), s1.getCf());
        Prestito p2 = new Prestito(l2.getIsbn(), s2.getCf());
        Prestito p3 = new Prestito(l3.getIsbn(), s3.getCf());

        gest.addLibro(l1);
        gest.addLibro(l2);
        gest.addLibro(l3);
        gest.addLibro(l4);

        gest.addSocio(s1);
        gest.addSocio(s2);
        gest.addSocio(s3);
        gest.addSocio(s4);
        gest.addSocio(s5);

        gest.addPrestito(p1);
        gest.addPrestito(p2);
        gest.addPrestito(p3);
        // */

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("I libri sono: ");

        for(String s : gest.visitaLibri())
            System.out.println(s.subSequence(7, s.length()) + "\n--");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("I soci sono: ");

        for(String s : gest.visitaSoci())
            System.out.println(s.subSequence(7, s.length()) + "\n--");

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("I prestiti aperti sono: ");

        for(String s : gest.visitaPrestiti()){
            if(s.charAt(0) == '[') System.out.println(s.subSequence(1, s.length()) + "\n--");
            else System.out.println(s + "\n--");
        }

       // /*
        gest.deletePrestito(p1.getLibro());

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Nuova stampa dei prestiti, uno è stato eliminato");

        for(String s : gest.visitaPrestiti()){
            if(s.charAt(0) == '[') System.out.println(s.subSequence(1, s.length()) + "\n--");
            else System.out.println(s + "\n--");
        }

        Util.backup(gest);
    }

}
