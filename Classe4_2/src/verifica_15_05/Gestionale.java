package verifica_15_05;

import java.util.ArrayList;
import java.util.HashMap;

public class Gestionale {
    /*
    Queste sono le collezzioni di cui ci serviamo
    Una collezione è come una variabile ma ci puoi mettere dentro più cose e hai anche dei metodi per gestirla
     */
    HashMap<String, Cliente> clienti = new HashMap<>();
    ArrayList<Conto> conti = new ArrayList<>();
    ArrayList<Operazione> op = new ArrayList<>();

    /*
    Questo metodo serve per aggiungere un elemento alla collezione
    Puoi capire di che collezione stiamo parlando guardando il tipo dell'argomento
    Questo commento vale per tutti i metodi add di questa classe
     */
    public void add(Cliente x) {
        clienti.put(x.getCF(), x);
    }

    /*
    Questo metodo serve per eliminare un elemento da una collezione
    Puoi capire di che collezione stiamo parlando guardando il tipo dell'argomento
    Questo commento vale per tutti i metodi remove di questa classe
     */
    public void remove(Cliente x) {
        clienti.remove(x.getCF());
    }

    public void add(Conto x) {
        conti.add(x);
    }

    public void remove(Conto x) {
        conti.remove(x);
    }

    public void add(Operazione x) {
        op.add(x);
    }

    public void remove(Operazione x) {
        op.remove(x);
    }

    /*
    Questo metodo permette di aggiungere un conto corrente alla rispettiva collezione
    Io non lo uso, ma da consegna doveva essere scritto quindi eccolo qui
     */
    public void addConto(Cliente x) {
        add(new Conto(x.getId()));
    }

    /*
    Questo metodo serve per eseguire un operazione su un conto corrente
     */
    public void doOp(Operazione x) {

        if(ifP(x.getCc())) throw new IllegalArgumentException("Conto non esistente");//qui controllo se il conto corrente esiste

        if(x.getImp() > x.getCc().getSaldof() && x.getImp() > 1500 && x.getImp() > x.getCc().getMove())
            //qui controllo che l'operazione che si sta provando a fare non superi il saldo del conto
            throw new IllegalArgumentException("Superato il limite");

        //qui nel caso sia andato tutto bene eseguo l'operazione sul conto
        add(x);
        x.getCc().setSaldo(x.getImp());
    }

    /*
    Questo metodo serve per far funzionare il metodo sopra
     */
    private boolean ifP(Conto x) {
        for(Conto i : conti) //questo si chiama foreach, scorre tutto l'arraylist conti e inserisce ogni iterazione l'oggetto che contiene dentro i
            if(i.compareTo(x) == 0) return false;
        return true;
    }

    /*
    Questo metodo permette di generare l'estratto conto di un determinato conto corrente
     */
    public void ec (Conto x) {
        String toRet = "Saldo iniziale " + x.getPreSaldo() + " , ";
        for(Operazione i : op)
            if(i.getCc().compareTo(x) == 0) toRet += i.toString() + " , ";
        toRet += "Saldo finale piu fido " + x.getSaldof();
        list(toRet.split(" , "));//Il metodo split permette di suddividere una stringa in pezzi più piccoli, la rendere un array dividendo in base all'argomento dell metodo
    }

    /*
    Questo metodo permette di stampare la lista completa dei clienti presenti
     */
    public void listCli() {
        String[] toRet = clienti.toString().split(", ");
        list(toRet);
    }

    /*
    Questo metodo permette di stampare la lista completa dei conti presenti
     */
    public void listConti() {
        String[] toRet = conti.toString().split(", ");
        list(toRet);
    }

    /*
    Questo metodo permette di stampare la lista completa delle operazioni presenti
     */
    public void listOp() {
        String[] toRet = op.toString().split(", ");
        list(toRet);
    }

    /*
    Questo metodo stampa a schermo
     */
    private void list(String[] x) {
        for(String i : x) {
            System.out.println(i);
            System.out.println();
        }
    }

}
