package gioco_15;

public class Board {
	
	public int p[] = new int[16];
	public int mtest[] = new int[16];
	private boolean there = false;
	
	public Board () {
		super();
		init();
		test();
	}
	
	//Dev
	public void test () {
		for(int i = 0 ; i < mtest.length ; i++) {
			mtest[i]=i+1;
			if(i == mtest.length-1)mtest[i] = 0;
		}
	}
	//End Dev

	public void init () {
		int count = 0;
		int wrong = 0;
		for(int i = 0 ; i < p.length ; i++)
			p[i]=20;
		for(int i = 0 ; i < p.length ; i++) {
			int o = (int) (Math.random()*17-1);
			for(int j = 0 ; j < p.length ; j++) {
				count++;
				if(o == p[j]) {
					there = true;
					wrong++;
				}
			}
			if(!there)
				p[i] = o;
			if(there) {
				there = false;
				i--;
			}
		}
		System.out.println("Dev: "+count+" "+wrong);
	}

	public void print (int[] p) {
		for(int i = 1 ; i < p.length+1 ; i++) {
			System.out.print(p[i-1]+ " ");
			if(p[i-1]<10) System.out.print(" ");
			if(i%4 == 0) System.out.println();
		}
	}

	public boolean done (int[] p) {
		for(int i = 0 ; i < p.length-1 ; i++)
			if(p[i] != i+1)return false;
		return true;
	}

	public int[] move (int[] p) {
		int[] toRet = new int[4];
		int in = 0;
		for(int i = 0 ; i < p.length ; i++)
			if(p[i] == 0) {
				in = i;
				break;
			}
		boolean print = false;
		try {
			toRet[0] = p[in-4];
		} catch (Exception e) {
			if(print)System.out.println("1 err");
		}
		try {
			toRet[1] = p[in-1];
		} catch (Exception e) {
			if(print)System.out.println("2 err");
		}
		try {
			toRet[2] = p[in+1];
		} catch (Exception e) {
			if(print)System.out.println("3 err");
		}
		try {
			toRet[3] = p[in+4];
		} catch (Exception e) {
			if(print)System.out.println("4 err");
		}
		return toRet;
	}

	public void doMove (int o, int[] p) {
		int in = 0;
		for(int i = 0 ; i < p.length ; i++)
			if(o == p[i]) in = i;
		int zero = 0;
		for(int i = 0 ; i < p.length ; i++)
			if(p[i] == 0) zero = i;
		p[zero] = p[in];
		p[in] = 0;
	}
}