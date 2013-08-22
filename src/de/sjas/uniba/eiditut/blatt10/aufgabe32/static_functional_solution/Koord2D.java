package de.sjas.uniba.eiditut.blatt10.aufgabe32.static_functional_solution;

/**
 * Handler, completely done with static variables. THIS IS BAD BAD STYLE!
 */
public class Koord2D {

	private int dim1,dim2;
	
	Koord2D(int x, int y) {
		this.dim1 = x;
		this.dim2 = y;
	}
	public static Koord2D create(int x, int y) {
		return new Koord2D(x, y);
	}

	public static int dim1(Koord2D k) {
		return k.dim1;
	}

	public static int dim2(Koord2D k) {
		return k.dim2;
	}

	// usage of ternary operator instead of if/else construct
	public static boolean equal(Koord2D k1, Koord2D k2) {
		return (k1.dim1 == k2.dim1 && k1.dim2 == k2.dim2 ? true : false);
	}

	public static Koord2D scalmul(int m, Koord2D k) {
		return new Koord2D((k.dim1 * m), (k.dim2 * m));
	}

	public static Koord2D add(Koord2D k1, Koord2D k2) {
		return new Koord2D(k1.dim1 + k2.dim1, k1.dim2 + k2.dim2);
	}

}
