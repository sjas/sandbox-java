package de.sjas.uniba.eiditut.blatt10.aufgabe32.OO_solution;

public class Koord2DMain2 {

	/**
	 * Semantik Teil des ADT zum ausfuehren und verifizieren.
	 * 
	 * Koord2DMain1.java and Koord2DMain2 are the same semantically, the only
	 * difference is the usage of the contructor or the static create() method.
	 * 
	 * Konsolenoutput muss fuenf mal 'true' ergeben.
	 */
	public static void main(String[] args) {

		int x1, x2, x3, x4;

		x1 = 3;
		x2 = 8;
		System.out.println(Koord2DImpl.create(x1, x2).dim1() == x1);
		System.out.println(Koord2DImpl.create(x1, x2).dim2() == x2);
		
		x3 = x1;
		x4 = x2;
		System.out.println(Koord2DImpl.create(x1, x2).equal(
				Koord2DImpl.create(x3, x4)) == (((x1 == x3 && x2 == x4) ? true : false)));
		
		Koord2DImpl k1 = Koord2DImpl.create(x2, x3);
		k1.scalmul(x1);
		System.out.println(k1.equal(Koord2DImpl.create((x1 * x2), (x1 * x3))));
		
		Koord2DImpl k2 = Koord2DImpl.create(x1, x2);
		k2.add(Koord2DImpl.create(x3, x4));
		System.out.println(k2.equal(Koord2DImpl.create(x1 + x3, x2 + x4)));
		
	}
}
