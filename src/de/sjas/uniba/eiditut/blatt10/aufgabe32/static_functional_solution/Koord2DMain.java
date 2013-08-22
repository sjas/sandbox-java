package de.sjas.uniba.eiditut.blatt10.aufgabe32.static_functional_solution;

public class Koord2DMain {

	/**
	 * Semantik Teil des ADT zum ausfuehren und verifizieren.
	 * 
	 * Konsolenoutput muss fuenf mal 'true' ergeben.
	 */
	public static void main(String[] args) {

		int x1,x2,x3,x4;
		
		x1 = 33;
		x2 = 22;
		System.out.println(Koord2D.dim1(Koord2D.create(x1, x2)) == x1);
		System.out.println(Koord2D.dim2(Koord2D.create(x1, x2)) == x2);
		
		x3 = x1;
		x4 = x2;
		// benutze fortan eigene KHandler.equal(), da == nicht fuer
		// Objektvergleich zulaessig!
		System.out.println(Koord2D.equal(Koord2D.create(x1, x2),
				Koord2D.create(x3, x4)) == ((x1 == x3) && (x2 == x4)));
		
		System.out.println(Koord2D.equal(
				Koord2D.scalmul(x1, Koord2D.create(x2, x3)),
				Koord2D.create((x1 * x2), (x1 * x3))));
		
		System.out.println(Koord2D.equal(
				Koord2D.add(Koord2D.create(x1, x2), Koord2D.create(x3, x4)),
				Koord2D.create((x1 + x3), (x2 + x4))));

	}

}
