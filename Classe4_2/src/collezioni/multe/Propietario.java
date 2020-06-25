package collezioni.multe;

public class Propietario {
    private String CF;
    private String name;
    private String addr;

    public Propietario(String CF, String name, String addr) {
        this.CF = CF;
        this.name = name;
        this.addr = addr;
    }

    public String getCF() {
        return CF;
    }

    public void setCF(String CF) {
        this.CF = CF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "CF='" + CF + '\'' +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                '}';
    }

    public int compareTo (Propietario x) {
        return this.CF.compareToIgnoreCase(x.CF);
    }
}
