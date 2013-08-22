/**
 * 
 */
package de.sjas.performance.forTest;

/**
 * Test performance difference of using array.length vs. predefined variable. To
 * get the most accurate results, the for-loops' bodies were left empty at
 * first. This did not work out, so the console prints were added.
 * 
 * Bottom line is, the optimization does not really make a big difference in
 * java. Usually it's like ~5% faster, but sometimes the optimized version is
 * even slower than the regular one.
 * 
 * Well, this could differ in other languages, as things are implementation
 * dependent.
 * 
 * Instead of using System.currentTimeMillis(), there is also System.nanoTime()
 * available. First is the absolute time via the system's clock, the latter is
 * the time in nanoseconds measured by a the JVM, only works for relative time
 * measurements.
 * 
 * @author sjas
 */
public class ForPerformanceTest {

	public static void main(String[] args) {

		// arbitrary array size, Integer.MAX_VALUE is too big ;)
		int arraySize = 10000000;
		int[] testArray = new int[arraySize];

		long testStartInMs;
		long testEndInMs;

		// the actual test runs

		// First test: Usual case
		testStartInMs = System.currentTimeMillis();
		for (int i = 0; i < testArray.length; i++) {
			System.out.print("");
		}
		testEndInMs = System.currentTimeMillis();

		// First Test Results
		System.out.print("First Test Duration:\t");
		System.out.println("" + (testEndInMs - testStartInMs));

		// Second test: read array length in initialization phase of loop
		testStartInMs = System.currentTimeMillis();
		for (int i = 0, arrayLength = testArray.length; i < arrayLength; i++) {
			System.out.print("");
		}
		testEndInMs = System.currentTimeMillis();

		// Second Test Results
		System.out.print("Second Test Duration:\t");
		System.out.println("" + (testEndInMs - testStartInMs));
		System.out.println();

		System.out.println("DONE!");
	}
}
