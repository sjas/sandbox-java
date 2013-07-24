package de.sjas.ioTest;

import java.io.IOException;

import de.sjas.ioTest.logic.MyReader;

public class IoTestMain {

	public static void main(String[] args) throws IOException {

		/*
		 * DOESNT WORK DUE TO BACKSLASHES INSTEAD OF SLASHES
		 */
		// MyReader blubb = new MyReader("C:\\\WORK\\\test\\\README.txt");

		/*
		 * THIS WORKS:
		 * 
		 * old code, included readme into project later, which explains code
		 * below the next single commented out line. were the triple slashes
		 * really needed? it's been quite a while since i touched this code...
		 * 
		 * TODO: check if this works on operating systems beside windows...
		 */
		// MyReader blubb = new MyReader("C:///WORK///test///README.txt");

		/*
		 * READ FROM PROJECT ROOT FOLDER
		 */
		MyReader reader1 = new MyReader("./rootResources/README.txt");
		reader1.read();

		/*
		 * just a delimiter...
		 */
		System.out
				.println("\n\n==============================================\n\n");

		/*
		 * READ FROM RESOURCES FOLDER LYING WITHIN THE PACKAGE TREE... remember
		 * to change this, when moving files around. eclipse wont fix the path
		 * automatically, like it automatically does just when refactoring
		 * classes!
		 */
		MyReader reader2 = new MyReader(
				"./src/de/sjas/ioTest/packageResources/README2.txt");
		reader2.read();

		System.out.println("\n\n\nDONE!");
	}
}