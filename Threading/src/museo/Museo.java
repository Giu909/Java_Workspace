package museo;

import java.util.concurrent.Semaphore;
/**
 * 
 * @author Giuseppe
 *
 */
public class Museo {
	int max;	
	Semaphore sem;

	public Museo(int dim){
		this.max = dim;
		this.sem = new Semaphore(dim);
	}

	/**
	 * Permette al Visitatore di entrare nel museo
	 * @param name nome del visitatore 
	 * @return boolean che indica l'avvenuto accesso o meno
	 */

	public boolean goIn(String name){
		if (sem.availablePermits()==0) {
			System.out.println(name + " nessun posto disponibile");
			return false;
		}
		try{
			sem.acquire();
			return true;
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Metodo che permette l'uscita da Museo del Visitatore
	 * 
	 */

	public void goOut(){
		sem.release();
	}
}