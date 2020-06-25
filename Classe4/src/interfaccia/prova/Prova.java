package interfaccia.prova;

public class Prova implements IntSequence {

	private int successivo = 0;
	
	@Override
	public boolean hasNext() {
		
		return true;
	}

	@Override
	public int next() {
		
		return successivo++;
	}

}
