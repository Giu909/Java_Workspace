package thread;

public class Main {//per utilizzare i metodi della classe Thread bisogna estenderla
	//ad ogni processo java e' assegnato un thread
	public int prova;
	public static void main(String[] args) {
		MyThread t1 = new MyThread("Uno ",1);
		MyThread t2 = new MyThread("Due ",9);
		t2.start();
		t1.start();
		for(int i = 0 ; i < 10 ; i ++)
			System.out.println("--> "+Thread.currentThread());//out: Thread[Nome thread, Priorita' , Gruppo di appartenenza]
	}
	
}
