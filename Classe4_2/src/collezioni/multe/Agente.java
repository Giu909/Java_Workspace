package collezioni.multe;

public class Agente {
    private static int count = 0;
    private int matricola;
    private String name;

    public Agente(String name) {
        this.matricola = count++;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Agente.count = count;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setMatricola(int matricola) {
        this.matricola = matricola;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Agente{" +
                "matricola=" + matricola +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo (Agente x){
        if(this.matricola == x.matricola)return 0;
        return 2;
    }

}
