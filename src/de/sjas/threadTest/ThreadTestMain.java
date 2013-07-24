package de.sjas.threadTest;

/**
 * Repeat this several times for fun, but previously guess where 'DONE' will
 * show up. You will be wrong most likely. :)
 * 
 * @author sjas
 */
public class ThreadTestMain {

	public static void main(String[] args) {

		int repeats = 3;
		// directly defined array
		String[] array = { "A", "B" };

		for (int i = 0; i < repeats; i++) {

			for (final String element : array) {

				new Thread() {

					@Override
					public void run() {
						System.out.println(element);
					}

				}.start();
			}
		}

		System.out.println("DONE!");
	}
}