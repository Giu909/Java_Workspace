package automobili.motorizzazione.civile;

import java.io.*;
import java.util.Arrays;
@SuppressWarnings({ "unused", "serial" })
public class Archivio implements Serializable {
	private Record[] lista = new Record[100];
	
	/**
	 * Il costruttore della classe Archivio fornisce due opzioni:
	 * 	1) Istanziare un nuovo oggetto
	 * 	2) Ripristinare un archivio, se presente
	 * @throws IOException
	 */
	public Archivio () throws IOException {
		//Rimane true se il file lista.bin esiste
		boolean found = true;
		//Cambia a seconda della scelta dell'utente
		boolean restore = false;
		ObjectInputStream in = null;
		
		try {
			
			in = new ObjectInputStream(new FileInputStream("lista.bin"));
			System.out.println("Si vuole ripristinare l'archivio in 'lista.bin'? s/n");
			char c = (char)System.in.read();

			if (c=='s')
				restore=true;
		
		}catch( IOException fe){
			found = false;	
		}
		finally {
	
			if(found && restore) {
				
				try {
					this.lista = (Record[]) in.readObject();
				}
				catch(IOException | ClassNotFoundException e) {	
				}
				
			}
			
		}
	}
	
	public Archivio (Archivio a) {
		this.lista = a.getLista();
	}
	
	/**
	 * Aggiunge un Record all'Archivio
	 * @param r
	 */
	public void addRecord (Record r) {
		
		for (int i = 0 ; i < lista.length ; i++)
			if (lista[i] == null) {
				lista[i] = new Record(r); 
				break;
			}
	}
	
	public Record[] getLista() {
		return lista;
	}
	
	/**
	 * Elimina il Record passato come parametro
	 * @param r
	 */
	public void deleteRecord(Record r) {
		for (int i = 0 ; i < lista.length ; i++) 
			if (lista[i].equals(r)) {
				lista[i] = null;
				break;
			}
		//shift();
	}
	
	/**
	 * Restituisce un array di Record con lo stesso nominativo
	 * @param p
	 * @return 
	 * @return
	 * @throws IOException 
	 */
	public Record[] getRecord (Persona p) throws IOException {
		
		Record[] toRet = new Record[100];
		//Sistema/chiedi al prof
		for (int i = 0 ; i < lista.length ; i++) {
			if (lista[i] == null) break;
			else
				if (lista[i].getPersona().equals(p)) {
					toRet[i] = lista[i];
			}
		}
		
		return toRet;
	}
	
	/**
	 * Salva un oggetto istanza della classe Archivio nel file 'lista.bin'
	 * @throws IOException
	 */
	public void salva() throws IOException {
        @SuppressWarnings("resource")
		ObjectOutputStream s = new ObjectOutputStream(new FileOutputStream("lista.bin"));
        try {
        	s.writeObject(lista);
        }catch(IOException io) {
        }
        s.flush();
	}

	@Override
	public String toString() {
		return "Archivio [lista=" + Arrays.toString(lista) + "]" ;
	}
	
	
	
}
