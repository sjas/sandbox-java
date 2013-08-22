package de.sjas.uniba.eiditut.blatt10.aufgabe32.OO_solution;

public class Koord2DImpl implements Koord2D, Cloneable {

	private int dim1, dim2;

	public Koord2DImpl(int x1, int x2) {
		this.dim1 = x1;
		this.dim2 = x2;
	}

	public static Koord2DImpl create(int x1, int x2) {
		return new Koord2DImpl(x1, x2);
	}

	@Override
	public int dim1() {
		return this.dim1;
	}

	@Override
	public int dim2() {
		return this.dim2;
	}

	@Override
	public boolean equal(Koord2DImpl k) {
		return this.dim1 == k.dim1 && this.dim2 == k.dim2;
	}

	// return new object based on this one, easier to use in main()
	@Override
	public void scalmul(int x) {
		this.dim1 = this.dim1 * x;
		// same as above, just syntactic sugar
		this.dim2 *= x;
	}

	@Override
	public void add(Koord2DImpl k) {
		this.dim1 = this.dim1 + k.dim1;
		// same as above, written with syntactic sugar
		this.dim2 += k.dim2;
	}

	@Override
	public Koord2DImpl clone() {
		return new Koord2DImpl(dim1, dim2);
	}

}
