package alberi;

public class ProvaAlbero {

	
	public static void main(String[] args) {
		AlberoBinario ab = new AlberoBinario();
		ab.add(17);
		ab.add(7);
		ab.add(11);
		ab.add(72);
		ab.add(22);
		ab.add(4);
		System.out.println("visita => "+ab);
		
		 for (int i=0; i<20; i++)
			System.out.println(" cerca "+ i + " -> "+ab.find(i));
		
		
		ab.delete(11);
		ab.delete(17);
		ab.add(12);
		ab.add(71);
		ab.add(25);
		ab.add(42);
		System.out.println("visita => "+ab);
		ab.delete(7);
		ab.delete(17);
		ab.delete(2);
		ab.delete(11);
		ab.delete(22);
		ab.delete(4);
		ab.delete(0);
		ab.delete(11);
		ab.delete(72);
		ab.delete(11);
		ab.delete(72);
		System.out.println("visita => "+ab);
		
	}
}
