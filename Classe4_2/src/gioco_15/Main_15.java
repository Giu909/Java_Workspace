package gioco_15;

import java.util.Scanner;

public class Main_15 {

	static Scanner kbd = new Scanner(System.in);

	public static void main(String[] args) {
		Board b = new Board();

		System.out.println();
		System.out.println("Gioco del 15\n");

		while(true) {
			System.out.println("Board: \n");
			b.print(b.p);
			System.out.print("Mosse possibili: ");
			b.print(b.move(b.p));
			System.out.print("\nNext move: ");
			int in = kbd.nextInt();
			for(int i : b.move(b.p)) {
				if(i == in)b.doMove(in, b.p);
			}
			if(b.done(b.p)) {
				System.out.println("Game over!");
				break;
			}
		}
	}
}
