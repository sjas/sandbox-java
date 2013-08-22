package de.sjas.uniba.eiditut.blatt10.aufgabe32.OO_solution;

public interface Koord2D {

	// next line commented out, since static methods cannot be put in interfaces
	// Koord2D_OO create(int x1, int x2);
	
	int dim1();
	int dim2();
	boolean equal(Koord2DImpl k);
	void scalmul(int x);
	void add(Koord2DImpl k);

}
