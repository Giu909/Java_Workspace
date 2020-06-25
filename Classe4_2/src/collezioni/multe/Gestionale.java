package collezioni.multe;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Gestionale {
    /**
     * Ho utilizzato un HashMap per i proprietari perché grazie al CF permettono un indicizzazione rapida e univoca
     * Stesso per le auto grazie alla targa
     * Per agenti e multe ho preferito due ArraList dato che hanno un numero sequenziale di matricola e questo
     * una gestione "Lineare" (Se così possiamo chiamarla) dei vari prodotti
     */

    private HashMap<String, Propietario> prop = new HashMap<>();
    private HashMap<String, Automobile> auto = new HashMap<>();
    private ArrayList<Agente> agenti = new ArrayList<>();
    private ArrayList<Multa> multe = new ArrayList<>();

    public void add (Propietario p) {
        prop.put(p.getCF(), p);
    }

    public void remove (Propietario p) {
        prop.remove(p.getCF());
    }

    public void add (Automobile p) {
        auto.put(p.getTarga(), p);
    }

    public void remove (Automobile p) {
        if(prop.get(p.getCF()) != null)
            auto.remove(p.getTarga());
        else throw new IllegalArgumentException("Non esiste un proprietario con questo CF");
    }

    public void add (Agente p) {
        agenti.add(p);
    }

    public void remove (Agente p) {
        agenti.removeIf(i -> p.compareTo(i) == 0);
    }

    public void add (Multa p) {
        if(auto.get(p.getTarga()) != null && agenti.get(p.getMat()) != null) multe.add(p);
        else throw new IllegalArgumentException("Non è stato trovato un proprietario o un agente corrispondenti " +
                "a quelli forniti");
    }

    public void remove (Multa p) {
        multe.removeIf(i -> p.compareTo(i) == 0);
    }

    public String[] listProp() {
        return prop.toString().split(", ");
    }

    public String[] listAuto() {
        return auto.toString().split(", ");
    }

    public String[] listAgenti() {
        return agenti.toString().split(", ");
    }

    public String[] listMulte() {
        return multe.toString().split(", ");
    }

    public ArrayList<Multa> list (Agente x, Propietario y) {
        ArrayList<Multa> toRet = new ArrayList<>();
        multe.forEach(multa -> {
            if(prop.get(auto.get(multa.getTarga()).getCF()).compareTo(y) == 0 &&
                    agenti.get(multa.getMat()).compareTo(x) == 0)
                toRet.add(multa);
        });
        return toRet;
    }

    public ArrayList<Agente> list (Automobile x) {
        ArrayList<Agente> toRet = new ArrayList<>();
        multe.forEach(multa -> {
            if(multa.getTarga().compareToIgnoreCase(x.getTarga()) == 0)
                toRet.add(agenti.get(multa.getMat()));
        });
        return toRet;
    }

    public ArrayList<Propietario> list (LocalDate begin, LocalDate end) {
        ArrayList<Propietario> toRet = new ArrayList<>();
        multe.forEach(multa -> {
            if(multa.getDate().isAfter(begin) && multa.getDate().isBefore(end))
                toRet.add(prop.get(auto.get(multa.getTarga()).getCF()));
        });
        return toRet;
    }
    //EASY XD
}
