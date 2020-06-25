package ioBasic;

import java.io.*;

/*
 * Decorazione STREAM:
 * � possibile utilizzare tipi di Stream pi� "evoluti": in questo esempio BufferedReader
 * il quale dispone del (pi� comodo) metodo readLine()).
 * Gli Stream pi� evoluti per funzionare devono essere istanziati a partire da Stream "base"
 * Si parla allora di DECORAZIONE degli Stream per intendere che uno Stream migliora (decora)
 * le caratteristiche di un altro. 
 * In questo esempio BufferedReader viene istanziato a partire da un FileReader.
*/

public class LeggiFilePlus {
	
	
	public static void main (String argv[]) {
	    if ( argv.length < 1) {
	        System.out.println(" manca parametro <nomefile> ");
	        System.exit(0);
	    }
	    new LeggiFilePlus(argv[0]);
	  }

	public LeggiFilePlus(String nome) {
		super();
		BufferedReader in = null;
		try{
			in = new BufferedReader(new FileReader(nome));	//apro STREAM
		}
		catch (FileNotFoundException fnfe){
			 System.err.println(" Il File "+ nome + " non esiste");
		     //fnfe.printStackTrace();
		     System.exit(0);
		}
		try{
			boolean eof = false;							//uso STREAM
			while (!eof){
				String s = in.readLine();
				if (s==null) 
					eof = true;
				else
					System.out.println(s);
			}
		}
		catch (IOException ioe){
		     ioe.printStackTrace();
		     System.exit(0);
		}
		finally{
	    	try {
	    	 in.close();                         			 // chiudo STREAM
	    	}
	    	catch (IOException e){}
	    }
	}

}
