package de.sjas.random.arrayToList.logic;

/**
 * Elements for the list, to make it easily fillable, it stores just int's.
 * 
 * @author sjas
 */
public class ListElem {

	// instance vars
	ListElem next;
	int data;

	// constructors
	public ListElem() {
		super();
		this.data = 0;
		this.next = null;
	}

	public ListElem(int i) {
		this.data = i;
		this.next = null;
	}

	// methods
	public ListElem getNext() {
		return this.next;
	}

	public void setNext(ListElem x) {
		this.next = x;
	}

	public int getData() {
		return this.data;
	}
}
