package collezioni.multe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner kbd = new Scanner(System.in);
    public static Gestionale gest = new Gestionale();
    public static void main (String[] args) {
        demo();
    }

    public static void demo() {
        System.out.println("Avvio modalità demo...");

        Propietario p1 = new Propietario("CF1", "Name1", "Addr1");
        Propietario p2 = new Propietario("CF2", "Name2", "Addr2");
        Propietario p3 = new Propietario("CF3", "Name3", "Addr3");
        Propietario p4 = new Propietario("CF4", "Name4", "Addr4");

        Automobile a1 = new Automobile("Targa1", "Modello1", p1.getCF());
        Automobile a2 = new Automobile("Targa2", "Modello2", p2.getCF());
        Automobile a3 = new Automobile("Targa3", "Modello3", p3.getCF());
        Automobile a4 = new Automobile("Targa4", "Modello4", p4.getCF());

        Agente ag1 = new Agente("Agente1");
        Agente ag2 = new Agente("Agente2");
        Agente ag3 = new Agente("Agente3");
        Agente ag4 = new Agente("Agente4");

        Multa m1 = new Multa(ag1.getMatricola(), a1.getTarga(), "Desc1");
        Multa m2 = new Multa(ag2.getMatricola(), a2.getTarga(), "Desc2");
        Multa m3 = new Multa(ag3.getMatricola(), a3.getTarga(), "Desc3");
        Multa m4 = new Multa(ag4.getMatricola(), a4.getTarga(), "Desc4");

        gest.add(p1);
        gest.add(p2);
        gest.add(p3);
        gest.add(p4);

        gest.add(a1);
        gest.add(a2);
        gest.add(a3);
        gest.add(a4);

        gest.add(ag1);
        gest.add(ag2);
        gest.add(ag3);
        gest.add(ag4);

        gest.add(m1);
        gest.add(m2);
        gest.add(m3);
        gest.add(m4);

        for (String i : gest.listProp()) {
            System.out.println(i);
        }

        for (String i : gest.listAuto()) {
            System.out.println(i);
        }

        for (String i : gest.listAgenti()) {
            System.out.println(i);
        }

        for (String i : gest.listMulte()) {
            System.out.println(i);
        }

        Multa m11 = new Multa(ag1.getMatricola(), a1.getTarga(), "Desc11");
        gest.list(ag1, p1);

        Automobile a11 = new Automobile("Targa11", "Modello11", p1.getCF());
        gest.list(a11);

        gest.list(LocalDate.now(), LocalDate.now());

        gest.remove(p2);
        gest.remove(a1);
        gest.remove(ag1);
        gest.remove(m1);

        for (String i : gest.listProp()) {
            System.out.println(i);
        }

        for (String i : gest.listAuto()) {
            System.out.println(i);
        }

        for (String i : gest.listAgenti()) {
            System.out.println(i);
        }

        for (String i : gest.listMulte()) {
            System.out.println(i);
        }


    }
}
