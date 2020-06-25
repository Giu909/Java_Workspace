package collezioni.magazzinoTony;

import collezioni.facco.Gestionale;

import java.io.*;

public class Backup {

    public static void backup(Magazzino m){
        ObjectOutputStream stream = null;

        try {

            stream = new ObjectOutputStream(new FileOutputStream(
                    new File("./salvataggio.bin")));
            stream.writeObject(m);
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }

    public static Magazzino restore() {
        ObjectInputStream stream = null;
        Magazzino toR = null;
        File save = new File("./salvataggio.bin");

        if(save.exists()) {
            try {

                stream = new ObjectInputStream(new FileInputStream(save));
                toR = (Magazzino) stream.readObject();
                stream.close();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

            System.out.println("Done");
        }
        return toR;
    }
}
