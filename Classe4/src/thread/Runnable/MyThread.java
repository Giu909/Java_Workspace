package thread.Runnable;

public class MyThread extends Thread{
	private static int pista = 1000;
	private static int p = 1;
	public MyThread(String name) {
		this.setName(name);
		this.start();
		}
	@Override
	public void run() {
		int corsa = 0;
		do {
			corsa += (int) (Math.random()*10);
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(corsa<pista);
		System.out.println(this.toString()+" Arrivato: "+p++);
	}
}