package verifica_15_05;

public class Cliente {
    private static int count;
    private int id;
    private String CF;
    private String name;

    public Cliente(String CF, String name) {
        this.id = count++;
        this.CF = CF;
        this.name = name;
    }

    public String getCF() {
        return CF;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "CF='" + CF + '\'' +
                " name='" + name + '\'' +
                '}';
    }

}
