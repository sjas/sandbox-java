package de.sjas.random.staxTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StaxMain {

	/**
	 * @param args
	 * @throws XMLStreamException
	 */
	public static void main(String[] args) throws XMLStreamException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(
					new File("resources/AKTUELL_20120101.xml"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		XMLInputFactory factory = XMLInputFactory.newInstance();
		XMLStreamReader staxXmlReader = null;
		try {
			staxXmlReader = factory.createXMLStreamReader(fis);
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}

		for (int event = staxXmlReader.next(); event != XMLStreamConstants.END_DOCUMENT; event = staxXmlReader
				.next()) {
			switch (event) {
			case XMLStreamConstants.START_DOCUMENT:
				System.out.println("Start document: "
						+ staxXmlReader.getLocalName());
				break;
			case XMLStreamConstants.START_ELEMENT:
				System.out.println("Start element: "
						+ staxXmlReader.getLocalName());
				// System.out.println("Element text "
				// + staxXmlReader.getElementText());
				break;
			case XMLStreamConstants.END_ELEMENT:
				System.out.println("End element: "
						+ staxXmlReader.getLocalName());
				break;
			default:
				break;
			}
		}
	}

}
