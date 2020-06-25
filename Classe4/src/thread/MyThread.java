package thread;

public class MyThread extends Thread{
	public MyThread(String nome, int priority) {
		this.setName(nome);
		this.setPriority(priority);
		
	}
	public void run() {
		//Il codice verra'  eseguito
		for(int i = 0; i<10; i++)
			System.out.println("--> "+Thread.currentThread());
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(true) {
			
		}
	}
}
