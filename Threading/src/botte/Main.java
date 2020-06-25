package botte;

public class Main {
    public static void main(String[] args) {
        Botte botte = new Botte();
/*        for (int i = 0; i < 20; i++)
            new Bevitore_longevo(botte, "Thread" + i);

       System.out.println();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        for (int i = 0; i < 20; i++)
            new Bevitore_longevo_sem(botte, "Thread " + i);
    }
}
