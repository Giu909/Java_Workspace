package collezioni.corriere;

public class Main {

    public static void main(String[] args) {
        Terminale t = new Terminale();
        Cliente c1 = new Cliente("Nome 1", "Info 1");
        Cliente c2 = new Cliente("Nome 2", "Info 2");
        Cliente c3 = new Cliente("Nome 3", "Info 3");
        Cliente c4 = new Cliente("Nome 4", "Info 4");
        Cliente c5 = new Cliente("Nome 5", "Info 5");
        Cliente c6 = new Cliente("Nome 6", "Info 6");

        t.addCli(c1);
        t.addCli(c2);
        t.addCli(c3);
        t.addCli(c4);
        t.addCli(c5);
        t.addCli(c6);

        Spedizione s1 = new Spedizione("EXA 1", t.addCli(c1), t.addCli(c2), t);
        Spedizione s2 = new Spedizione("EXA 2", t.addCli(c3), t.addCli(c4), t);
        Spedizione s3 = new Spedizione("EXA 3", t.addCli(c5), t.addCli(c6), t);

        t.addShip(s1);
        t.addShip(s2);
        t.addShip(s3);

        System.out.println(t.ricezione(s1));
        System.out.println(t.ricezione(s2));
        System.out.println(t.ricezione(s3));
    }
}
