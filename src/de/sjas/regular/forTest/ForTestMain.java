package de.sjas.regular.forTest;

/**
 * test what 'for(;;)' does, should be the same as 'while(true)'...
 * 
 * @author sjas
 */
public class ForTestMain {

	public static void main(String[] args) {

		for (;;) {
			System.out.println("This fortest loops forever...?");
			System.out.println("\n\n\n\nDONE?\n\n\n\n");
		}
	}
}
