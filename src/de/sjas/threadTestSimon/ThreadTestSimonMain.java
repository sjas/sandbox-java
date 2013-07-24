package de.sjas.threadTestSimon;

/**
 * Guess what this will show before execution...
 * 
 * Hint: Repeat this several times, and guess where 'DONE' will show up. Threads
 * running concurrently are a different kind of beast to fix.
 * 
 * @author Simon Harrer, originally, changed by sjas
 * 
 */
public class ThreadTestSimonMain {

	public static void main(String[] args) {
		// init array
		String[] array = new String[2];
		array[0] = "One";
		array[1] = "Two";

		// iterate and print in thread
		for (final String element : array) {
			new Thread() {
				@Override
				public void run() {
					System.out.println(element);
				}
			}.start();
		}

		System.out.println("DONE!");
	}
}