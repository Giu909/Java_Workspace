package collezioni.corriere;

import java.util.HashMap;
import java.util.TreeMap;

public class Terminale {
    private TreeMap<String, Cliente> cliente = new TreeMap();
    private HashMap<String, Spedizione> spedizione = new HashMap<>();

    public String addCli(Cliente c) {
        cliente.put(c.getName(), c);
        return c.getName();
    }

    public Cliente getCli(String name){
       return cliente.get(name);
    }

    public Spedizione addShip(Spedizione s) {
        spedizione.put(s.getCode(), s);
        return s;
    }

    public Spedizione getShip(Spedizione s) {
        return spedizione.get(s.getCode());
    }

    public String ricezione (Spedizione s) {

        return spedizione.get(s.getCode()).toString();
    }
}