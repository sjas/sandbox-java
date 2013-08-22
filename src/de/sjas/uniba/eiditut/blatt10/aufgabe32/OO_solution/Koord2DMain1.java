package de.sjas.uniba.eiditut.blatt10.aufgabe32.OO_solution;

public class Koord2DMain1 {

	/**
	 * Semantik Teil des ADT zum ausfuehren und verifizieren.
	 * 
	 * Koord2DMain1.java and Koord2DMain2 are the same semantically, the only
	 * difference is the usage of the contructor or the static create() method.
	 * 
	 * Konsolenoutput muss fuenf mal 'true' ergeben.
	 */
	public static void main(String[] args) {

		Koord2DImpl k1, k2, k3, k4, k5;
		int x1, x2, x3, x4;

		x1 = 5;
		x2 = 7;
		k1 = new Koord2DImpl(x1, x2);
		System.out.println(k1.dim1() == x1);
		System.out.println(k1.dim2() == x2);

		x3 = x1;
		x4 = x2;
		k2 = new Koord2DImpl(x3, x4);
		System.out.println(k1.equal(k2) == (x1 == x3 && x2 == x4));
		
		k3 = new Koord2DImpl(x2, x3);
		k3.scalmul(x1);
		k4 = new Koord2DImpl(x1 * x2, x1 * x3);
		System.out.println(k3.equal(k4));

		k1.add(k2);
		k5 = new Koord2DImpl(x1 + x3, x2 + x4);
		System.out.println(k1.equal(k5));

	}
}
