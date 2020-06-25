package ioBasic;

/**
 *  Creazione di un file di testo.
 *
 * Prima di usare il file vero e proprio ci si accerta se il file esiste,
 * ed eventualmente si chiede se vogliamo sovrascriverlo.
 * Per controllare se il file esiste si usa un oggetto di tipo FILE.
 *
 * Il funzionamento regolare prevede la lettura della tastiera ( System.in)
 * e l'invio dei caratteri letti allo STREAM out. All'arrivo dell'EOF (ctrl+Z) da
 * tastiera si svuota il buffer di output e si chiude il file.
 *
 */

import java.io.*;

public class ScriviFile {

	public static void main(String argv[]) {
		if (argv.length < 1) {
			System.out.println(" manca parametro <nomefile> ");
			System.exit(0);
		}
		new ScriviFile(argv[0]);
	}

	public ScriviFile(String nome) {
		FileWriter out = null;
		File test = null;
		try {
			test = new File(nome);
		} catch (NullPointerException npe) {
			System.exit(0);
		}

		if (test.exists()) {
			System.out.print("File " + nome + " esiste. Sovrascrivere?(S/N)");
			try {
				char risp = (char) System.in.read();
				if ((risp != 's') && (risp != 'S'))
					System.exit(0);
			} catch (IOException e) {
			}
		}

		try {
			out = new FileWriter(nome); 			// apro STREAM
		} catch (IOException ioe) {
			System.out.println("Errore apertura File " + nome);
			ioe.printStackTrace();
			System.exit(0);
		}

		try {
//			int c;
//			while ((c = System.in.read()) >= 0)      // uso STREAM
//				out.write((char) c);
			int[] a = {1,2,3,4,5,6,7,8,9,10};
			for(int i = 0 ; i < a.length;i++)out.write((char)a[i]);
			out.flush();                  			// svuoto buffer
			
		} catch (IOException e) {}
		finally{
	    	try {
	    	 out.close();               			// chiudo STREAM
	    	}
	    	catch (IOException e){}
	    }

	}

}

