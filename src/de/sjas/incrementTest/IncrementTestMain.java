package de.sjas.incrementTest;

public class IncrementTestMain {

	public static void main(String[] args) {

		int i = 0;

		System.out.println("base value: " + i);
		System.out.println();

		System.out.println(i++ + " ... was postincremented by i++");
		System.out.println(i++ + " ... was postincremented by i++");
		System.out.println();

		System.out.println(++i + " ... was preincremented by ++i");
		System.out.println(++i + " ... was preincremented by ++i");
		System.out.println();

		System.out.println("final result: " + i);

		System.out.println("\n\nDONE!");
	}
}
