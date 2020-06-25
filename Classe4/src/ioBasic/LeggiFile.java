package ioBasic;

/**
* Gli STREAM possono avere come origine o destinazione dei file.
* In questi casi le classi da utilizzare sono:
* FileInputStream: per leggere file di byte
* FileReader     : per leggere file di testo Unicode
*                  
* FileOutputStream: per scrivere file di byte
* FileWriter      : per scrivere file di testo Unicode    
*
*
* Quando utilizziamo STREAM non associati dal sistema a dispositivi standard
* dobbiamo ricordare che l'uso "regolare" deve prevedere (in sequenza) di:
*
* - aprire lo STREAM
* - usare lo STREAM
* - chiudere lo STREAM
*
* L'apertura di uno STREAM viene effettuata implicitamente all'atto
* dell'instanziazione (new).

* Usare una delle prime 2 classi significa "aprire un file in LETTURA"
* Usare le seconde 2 "aprire un file in SCRITTURA"
* La lettura lascia il file inalterato.
* La scrittura e' DISTRUTTIVA, o meglio: si puo' scegliere di:
* - creare un file e se esiste eventualmente un file con quel nome viene
*   sovrascritto
* - aggiungere byte/caratteri in coda ad file esistente
* in ogni caso il file verra' modificato.

* L'uso, ovviamente, si riferisce all'utilizzo dei metodi appropriati per
* leggere dallo STREAM o scrivere sullo STREAM.

* Si ricorda che gli STREAM sono UNIDIREZIONALI e che il loro utilizzo "classico" e' SEQUENZIALE.

* in fase di lettura abbiamo a disposizione il metodo
* int read()
* che legge un byte/carattere dallo STREAM  di ingresso restituendo un int
* alla fine del file restituisce -1 (eof).

* altre azioni previste sono la lettura di un array di byte/caratteri in un
* colpo solo, la possibilita' di marcare un punto del file per ritornare
* successivamente indietro a quel punto, saltare un certo numero di byte.

* Analogamente per le operazioni di scrittura abbiamo a disposizione il metodo
* void write(int)
* che scrive un byte/carattere in output

* si possono scrivere anche array di int e se lo STREAM e' di tipo FileWriter
* si possono scrivere direttamente stringhe.
* importante l'uso del metodo
* void flush()
* che svuota il buffer di uscita sullo STREAM

* in ogni caso per la chiusura si utilizza un metodo di tipo
* void close()
* con cio' il file non puo' piu' essere aperto con la stessa istanza

* Poiche' si possono verificare errori nelle operazioni I/O, il codice che
* fa uso di questi STREAM  deve essere racchiuso in blocchi try/catch
* In caso di errore viene gettata una eccezione di tipo IOException.
*/


import java.io.*;

public class LeggiFile {

  public static void main (String argv[]) {
    if ( argv.length < 1) {
        System.out.println(" manca parametro <nomefile> ");
        System.exit(0);
    }
    new LeggiFile(argv[0]);
  }

  public LeggiFile(String nome) {
	FileInputStream in = null;
    try {
       in = new FileInputStream(nome);      		// apro STREAM
    }
    catch ( IOException e) {
        System.err.println(" Il File "+ nome + " non esiste");
        System.exit(0);
    }
    try {
      
        			// uso STREAM
        int[] a = new int[10];
      for(int i = 0; i< a.length;i++)a[i]=in.read();
      for(int i = 0; i< a.length;i++)System.out.println(a[i]);
      
    }
    catch ( IOException e) {
    	 System.err.println(e.getMessage());
         System.exit(0);
    }
    finally{
    	try {
    	 in.close();                          		// chiudo STREAM
    	}
    	catch (IOException e){}
    }
  }
  
}