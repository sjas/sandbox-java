package de.sjas.regular.forTest;

/**
 * To check if foreach works with simple arrays, and emtpy ones especially.
 * 
 * @author sjas
 */
public class ForTest3Main {

	public static void main(String[] args) {

		int arrayLength = 5;
		String[] testArray = new String[arrayLength];

		System.out
				.println("Can java iterate over an emtpy array with foreach?\n");

		for (String i : testArray) {
			System.out.println(i);
		}

		System.out.println("\nIt seems it can.");
		System.out.println("And it does not care about null's.");

		System.out.println("\nDONE!");
	}

}
