package collezioni.biblioteca;

import java.io.*;

public class Backup {
    public static void backup(Biblioteca gestionale){
        ObjectOutputStream stream = null;

        try {

            stream = new ObjectOutputStream(new FileOutputStream(new File("./backup.bin")));
            stream.writeObject(gestionale);
            stream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }

    public static Biblioteca restore() {
        ObjectInputStream stream = null;
        Biblioteca toRet = null;
        File save = new File("./backup.bin");

        if(save.exists()) {
            try {

                stream = new ObjectInputStream(new FileInputStream(save));
                toRet = (Biblioteca) stream.readObject();
                stream.close();

            } catch (IOException | ClassNotFoundException e) {

                e.printStackTrace();
            }

            System.out.println("Done");
        }
        return toRet;
    }
}
