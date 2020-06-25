package gokart;

public class Main {

    public static void main(String[] args) {
        Pista pista = new Pista();
        for (int i = 0 ; i < 8 ; i++) new Pilota(pista,"pilota " + i);
    }
}
