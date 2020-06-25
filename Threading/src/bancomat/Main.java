package bancomat;

public class Main {

    public static void main(String[] args) {
        Bancomat b = new Bancomat();
        Cliente c1 = new Cliente(b, "Cliente 1");
        Cliente c2 = new Cliente(b, "Cliente 2");
        Cliente c3 = new Cliente(b, "Cliente 3");
        Cliente c4 = new Cliente(b, "Cliente 4");
    }
}
