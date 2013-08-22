package de.sjas.uniba.eiditut.blatt10.aufgabe32.OO_functional_solution;

public interface Koord2D {

	Koord2DImpl create(int x, int y);

	int dim1(Koord2DImpl k);

	int dim2(Koord2DImpl k);

	boolean equal(Koord2DImpl k1, Koord2DImpl k2);

	Koord2DImpl scalmul(int m, Koord2DImpl k);

	Koord2DImpl add(Koord2DImpl k1, Koord2DImpl k2);

}
