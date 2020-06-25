package ioBasic;

import java.io.*;

/*
 * DECORAZIONE Stream
 */

public class ScriviFilePlus {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println(" manca parametro <nomefile> ");
			System.exit(0);
		}
		new ScriviFilePlus(args[0]);
	}

	public ScriviFilePlus(String nome) {
		super();
		BufferedWriter out = null;
		try{
			out = new BufferedWriter(new FileWriter(nome));	//apro STREAM
		}
		catch (IOException ioe){
		     ioe.printStackTrace();
		     System.exit(0);
		}
		try{
			boolean more = true;	
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			while (more){									//uso STREAM
				String s = in.readLine();
				if (s== null || s.equals(""))			//eof da tastiera : linea vuota	o ctrl+Z	
					more = false;
				else
					out.write(s+"\r\n");
			}
		}
		catch (IOException ioe){
		     ioe.printStackTrace();
		     System.exit(0);
		}
		finally{
	    	try {
	    	 out.close();                         			 // chiudo STREAM
	    	}
	    	catch (IOException e){}
	    }
	}

}
