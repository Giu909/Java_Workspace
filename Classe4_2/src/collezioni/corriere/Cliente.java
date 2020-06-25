package collezioni.corriere;

public class Cliente {
    private String name;
    private String info;

    public Cliente(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Cliente: "+this.name+" Informazioni: "+this.info;
    }

}
