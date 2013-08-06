package de.sjas.regular.ioTest.logic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Java 6 compatible code. Java 7 has got the try-with-resources construct,
 * autoclosing resources.
 * 
 * TODO Include a Java 7 sample here sometime...
 * 
 * @throws IOException
 * 
 * @author sjas
 */
public class MyReader {

	private final String filename;

	public MyReader(String dateiname) {
		this.filename = dateiname;
	}

	public void read() throws IOException {

		// create reader...
		BufferedReader br = new BufferedReader(new FileReader(
				new File(filename)));

		String tempString = "";
		// when end of file is reached, readline returns 'null' IIRC
		while (tempString != null) {

			tempString = br.readLine();
			if (tempString != null)
				System.out.println(tempString);

		}
		// ...close reader after reading is finished
		br.close();
	}
}
