/**
 * 
 */
package de.sjas.performance.forTest;

/**
 * Testing performance of for loops.
 * 
 * 1. regular
 * 
 * 2. getting length during initialization phase, so no object access is needed
 * 
 * 3. getting length prior to for loop
 * 
 * RESULT = no differences.
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

		// first test: usual case
		testStartInMs = System.currentTimeMillis();
		for (int i = 0; i < testArray.length; i++) {
			System.out.print("");
		}
		testEndInMs = System.currentTimeMillis();
		System.out.print("First Test Duration:\t");
		System.out.println("" + (testEndInMs - testStartInMs));

		// second test: read array length in initialization phase of loop
		testStartInMs = System.currentTimeMillis();
		for (int i = 0, arrayLength = testArray.length; i < arrayLength; i++) {
			System.out.print("");
		}
		testEndInMs = System.currentTimeMillis();
		System.out.print("Second Test Duration:\t");
		System.out.println("" + (testEndInMs - testStartInMs));

		// third test
		testStartInMs = System.currentTimeMillis();
		int arrayLength = testArray.length;
		for (int i = 0; i < arrayLength; i++) {
			System.out.print("");
		}
		testEndInMs = System.currentTimeMillis();
		System.out.print("Third Test Duration:\t");
		System.out.println("" + (testEndInMs - testStartInMs));

		System.out.println("\n\nDONE!");
	}
}
