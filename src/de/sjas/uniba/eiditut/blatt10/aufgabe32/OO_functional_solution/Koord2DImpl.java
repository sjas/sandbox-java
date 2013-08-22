package de.sjas.uniba.eiditut.blatt10.aufgabe32.OO_functional_solution;

public class Koord2DImpl implements Koord2D {
	
	// instance variables
	int dim1, dim2;
	
	// constructors
	public Koord2DImpl(int x, int y) {
		this.dim1 = x;
		this.dim2 = y;
	}

	public Koord2DImpl() {
		super();
	}
	
	// methods
	public Koord2DImpl create(int x, int y) {
		return new Koord2DImpl(x, y);
	}

	@Override
	public int dim1(Koord2DImpl k) {
		return k.dim1;
	}

	@Override
	public int dim2(Koord2DImpl k) {
		return k.dim2;
	}

	@Override
	public boolean equal(Koord2DImpl k1, Koord2DImpl k2) {
		return k1.dim1 == k2.dim1 && k1.dim2 == k2.dim2;
	}

	@Override
	public Koord2DImpl scalmul(int m, Koord2DImpl k) {
		return new Koord2DImpl(m * k.dim1, m * k.dim2);
	}

	@Override
	public Koord2DImpl add(Koord2DImpl k1, Koord2DImpl k2) {
		return new Koord2DImpl(k1.dim1 + k2.dim1, k1.dim2 + k2.dim2);
	}
}
