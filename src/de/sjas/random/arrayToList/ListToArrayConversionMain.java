package de.sjas.random.arrayToList;

/**
 * List to Array and Array to list, for fun.
 * 
 * Implemented the singly-linked list, too.
 * 
 * @author sjas
 */
public class ListToArrayConversionMain {

	public static void main(String[] args) {

		// create and fill array more or less arbitrarily
		int arraySize = 10;
		int[] testArray = new int[arraySize];
		for (int i = 0; i < arraySize; i++) {
			testArray[i] = (int) (Math.random() * 100);
		}

		// show array contents
		System.out.println("Array contents:");
		for (int i = 0; i < arraySize; i++) {
			System.out.print(testArray[i] + " ");
		}
		System.out.println();

		// convert array to list and print contents
		SinglyLinkedList sll = SinglyLinkedList.convertArrayIntoList(testArray);
		System.out.println("List contents:");
		System.out.println(sll.toString());

		// convert list to array again and print contents again...
		int[] roundTrippedArray = SinglyLinkedList.convertListIntoArray(sll);
		System.out.println("Round-Trip array contents:");
		for (int i = 0; i < roundTrippedArray.length; i++) {
			System.out.print(roundTrippedArray[i] + " ");
		}
		System.out.println("\n");

		System.out.println("DONE!");
	}
}