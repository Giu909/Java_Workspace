package verifica_15_05;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Gestionale gest = new Gestionale();

        Cliente c1 = new Cliente("CF1", "Nome1");
        Cliente c2 = new Cliente("CF2", "Nome2");
        Cliente c3 = new Cliente("CF3", "Nome3");
        Cliente c4 = new Cliente("CF4", "Nome4");

        Conto f1 = new Conto(c1.getId());
        Conto f2 = new Conto(c2.getId());
        Conto f3 = new Conto(c3.getId());
        Conto f4 = new Conto(c4.getId());

        Operazione o1 = new Operazione(f1, +20, LocalDate.now(), "Desc1");
        Operazione o2 = new Operazione(f2, +20, LocalDate.now(), "Desc2");
        Operazione o3 = new Operazione(f3, -20, LocalDate.now(), "Desc3");
        Operazione o4 = new Operazione(f4, -20, LocalDate.now(), "Desc4");

        gest.add(c1);
        gest.add(c2);
        gest.add(c3);
        gest.add(c4);

        gest.add(f1);
        gest.add(f2);
        gest.add(f3);
        gest.add(f4);

        gest.doOp(o1);
        gest.doOp(o2);
        gest.doOp(o3);
        gest.doOp(o4);

        gest.listCli();

        System.out.println();

        gest.listConti();

        System.out.println();

        gest.listOp();

        System.out.println();

        gest.listOp();

        System.out.println();

        gest.ec(f1);

    }
}
