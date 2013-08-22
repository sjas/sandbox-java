package de.sjas.uniba.eiditut.blatt10.aufgabe32.OO_functional_solution;

public class Koord2DMain {

	/**
	 * Semantik Teil des ADT zum ausfuehren und verifizieren.
	 * 
	 * Konsolenoutput muss fuenf mal 'true' ergeben.
	 */
	public static void main(String[] args) {

		int x1,x2,x3,x4;
		
		Koord2DImpl kh = new Koord2DImpl();
		
		x1 = 1;
		x2 = 2;
		System.out.println(kh.dim1(kh.create(x1, x2)) == x1);
		System.out.println(kh.dim2(kh.create(x1, x2)) == x2);
		
		x3 = x1;
		x4 = x2;
		// benutze fortan eigene kh.equal(), da == nicht fuer
		// Objektvergleich zulaessig!
		System.out.println(kh.equal(kh.create(x1, x2),
				kh.create(x3, x4)) == (x1 == x3 && x2 == x4));
		
		System.out.println(kh.equal(
				kh.scalmul(x1, kh.create(x2, x3)),
				kh.create(x1 * x2, x1 * x3)));
		
		System.out.println(kh.equal(
				kh.add(kh.create(x1, x2), kh.create(x3, x4)),
				kh.create(x1 + x3, x2 + x4)));
	}

}
