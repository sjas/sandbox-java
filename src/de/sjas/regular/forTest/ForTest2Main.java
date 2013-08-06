package de.sjas.regular.forTest;

/**
 * More 'for(e)play'...
 * 
 * @author sjas
 */
public class ForTest2Main {

	public static void main(String[] args) {

		// it seems you cannot initialize different types for 'i' and 'j' at
		// once
		System.out.println("----------");
		System.out.println("FIRST TEST");
		System.out.println("----------");
		for (double i = 1, j = 10; i <= 5; i++, j += 10) {
			System.out.println("i = " + i);
			System.out.println("j = " + j);
			System.out.println();
		}

		// how about declaring them before?
		System.out.println("-----------");
		System.out.println("SECOND TEST");
		System.out.println("-----------");
		int a;
		long b;
		for (a = 1, b = 10; a < 5; a++, b += 10) {
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println();
		}
		
		// backwards? -yes!
		System.out.println("----------");
		System.out.println("THIRD TEST");
		System.out.println("----------");
		for (int i = 5; i > 0; --i) {
			System.out.println("i = " + i);
		}
		System.out.println();
		for (int j = 5; j > 0; j--) {
			System.out.println("j = " + j);
		}

		System.out.println("\nDONE!");

	}
}
