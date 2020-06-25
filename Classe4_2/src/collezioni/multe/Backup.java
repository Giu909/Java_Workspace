package collezioni.multe;

import java.io.*;

// TODO: 15/05/2020 Sistemare
public class Backup {
    
    public static void backup(Gestionale gestionale){
        ObjectOutputStream stream = null;

        try {

            stream = new ObjectOutputStream(new FileOutputStream(new File("./salvataggio.bin")));
            stream.writeObject(gestionale);
            stream.close();

        } catch (IOException e) {
            System.err.println("Errore durante il salvataggio del gestionale");
            e.printStackTrace();
        }

        System.out.println("Salvataggio andato a buon fine!");
    }

    /**
     * Se il file non esiste restituisce null
     * @return
     */
    public static Gestionale restore() {
        ObjectInputStream stream = null;
        Gestionale toR = null;
        File save = new File("*/salvataggio.bin");

        if(save.exists()) {
            try {

                stream = new ObjectInputStream(new FileInputStream(save));
                toR = (Gestionale) stream.readObject();
                stream.close();

            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Errore durante il salvataggio del gestionale");
                e.printStackTrace();
            }

            System.out.println("Ripristino eseguito");
        }
        return toR;
    }
}
