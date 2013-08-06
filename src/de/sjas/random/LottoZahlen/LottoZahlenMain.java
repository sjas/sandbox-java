package de.sjas.random.LottoZahlen;

public class LottoZahlenMain {

	/**
	 * Das ist eine Loesung mit einer do-while Schleife. Die Schleife wird
	 * mindestens einmal durchlaufen, auch wenn die Bedingung 'istDoppelt'
	 * initial vor dem ersten Schleifendurchlauf 'false' ist, oder wie hier,
	 * nicht initialisiert wurde.
	 * 
	 * Wuerde eine normale while-Schleife benutzt werden, so muesste
	 * 'istDoppelt' auf 'true' initialisiert werden.
	 * 
	 * Wenn eine doppelte Zahl gefunden wird, wird dies ueber ein println()
	 * Statement auf der Console signalisiert. Code mehrmals hintereinander
	 * ausfuehren, um dies zu erreichen/sehen.
	 */
	public static void main(String[] args) {

		// VARIABLENDEFINITION
		int ANZAHL = 6;
		int[] lottoZahlen = new int[ANZAHL];

		// TATSAECHLICHES PROGRAMM
		// Erste Stelle und Folgende werden gleich behandelt.
		// ANZAHL direkt uebergeben, statt die Arraygroesse auslesen zu lassen.
		for (int i = 0; i < ANZAHL; i++) {

			boolean istDoppelt;
			int temp = 0;

			do {
				// Schleifenbedingung muss vor jedem Durchlauf resetted werden,
				// sonst Endlosschleife bei Auftreten eines 'Doppel-Falles'.
				istDoppelt = false;
				// erstelle zu pruefende Zahl
				temp = erstelleZahl();

				// laufe array rueckwaerts durch...
				for (int j = i - 1; j > 0; j--) {
					// ... und pruefe alle Zahlen vorher
					if (lottoZahlen[j] == temp) {
						// setze Schleifenvariable auf 'true' falls bereits im
						// Array vorhanden
						istDoppelt = true;
						System.out.println("Es gab eine doppelte Zahl.");
					}
				}
			} while (istDoppelt);

			// falls gefundene temp-Zahl nicht doppelt vorkaeme, hier
			// schliesslich die Zuweisung
			lottoZahlen[i] = temp;
		}
		druckeZahlenAufConsole(lottoZahlen);
	}

	// ------------------------- HILFSMETHODEN -------------------------------
	/**
	 * Hier folgen alle Hilfsmethoden damit man weniger tippen muss ;)
	 * 
	 * Ok, nicht unbedingt weniger tippen, aber der Code oben wird dadurch
	 * Einiges kompakter, lesbarer und verstaendlicher, dadurch dass der Kram
	 * hier runter ausgelagert ist.
	 * 
	 * Erste Methode erstellt Zufallszahl welche nicht '0' ist. Keine ahnung ob
	 * Math.random() auch '0' zurueckgibt... Jedenfalls wirds abgefangen.
	 * 
	 * Untere Methode ist lediglich fuer einfacheres Ausgeben der finalen
	 * Lottozahlen.
	 */
	private static int erstelleZahl() {
		int erstellteZahl = 0;
		boolean istNull = true;

		while (istNull) {
			erstellteZahl = (int) (Math.random() * 50);

			if (erstellteZahl != 0) {
				istNull = false;
			}
		}
		return erstellteZahl;
	}

	private static void druckeZahlenAufConsole(int[] zahlenArray) {
		for (int i = 0; i < zahlenArray.length; i++) {
			System.out.print(" " + zahlenArray[i]);
		}
		System.out.println();
	}
}