package collezioni.magazzinoTony;

public class Main {
    /**
     * Per risolvere il problema del metodo che ritorna un operazione data la sua descrizione
     * ho usato un hashmap con chiave la descrizione
     *
     */
    public static void main (String[] args) {
        Magazzino m = new Magazzino();
        Materiale m1 = new Materiale(1, 1, "Desc1");
        Materiale m2 = new Materiale(2, 2, "Desc2");
        Materiale m3 = new Materiale(3, 3, "Desc3");
        Materiale m4 = new Materiale(4, 4, "Desc4");

        m.addMat(m1);
        m.addMat(m2);
        m.addMat(m3);
        m.addMat(m4);
        

        m.listMat();
        /**
         * Alcune di queste operazioni non hanno effetto sui materiali perch�
         * il valore dell'importo o della quantita scende sotto lo zero, quindi si,
         * ho previsto anche il caso che un utente cerchi di inserire un ordine che porta il materiale sotto 0
         */
        m.doOp(m.addOps(10, 0, "Desc1"));
        m.doOp(m.addOps(-10, 0, "Desc2"));
        m.doOp(m.addOps(0, 10, "Desc3"));
        m.doOp(m.addOps(0, -10, "Desc4"));

        m.listOps();



        System.out.println(m.listOpsDesc("Desc1"));

        m.listMat();

        Backup.backup(m);
        Magazzino bk = Backup.restore();
    }

}
