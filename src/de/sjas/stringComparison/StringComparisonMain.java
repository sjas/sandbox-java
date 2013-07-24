package de.sjas.stringComparison;

/**
 * Difference between identity and equality in java.
 * 
 * @author sjas
 */
public class StringComparisonMain {

	public static void main(String[] args) {

		/*
		 * 
		 * CREATE TWO DIFFERENT REFERENCES TO TWO DIFFERENT BUT EQUAL STRING
		 * OBJECTS
		 * 
		 * 'two' must be created like this else test will create false
		 * positives: one = "asdf"; two = "asdf"; ... will falsely yield 'true'
		 * for identity check. This is due to optimizations going in inside the
		 * JRE, I believe.
		 */
		String one = "bla";
		String two;
		two = "b" + "l";
		two = two + "a";
		String three = "bla";

		/*
		 * ACTUAL TESTING CODE
		 */
		System.out.println("different reference leading to equal objects:");
		stringCompare(one, two);
		System.out.println("as above, but false positive: (!)");
		stringCompare(one, three);

		// changing to same references to the same String object
		one = two;

		System.out.println("identical references to same single object:");
		stringCompare(one, two);

		// different Strings (and ofc different objects...)
		one = "test";

		System.out.println("different Strings/objects:");
		stringCompare(one, two);

		System.out.println("\nDONE!");

	}

	private static void stringCompare(String stringOne, String stringTwo) {

		// first test for identity (reference to same object)
		if (stringOne == stringTwo) {
			System.out.println("== true");
		} else {
			System.out.println("== false");
		}

		// second test for equality (two referenced objects are equal)
		if (stringOne.equals(stringTwo)) {
			System.out.println("equals true");
		} else {
			System.out.println("equals false");
		}

		// there is not just 'System.out.println' out there...
		System.out.print("\n");
	}
}
