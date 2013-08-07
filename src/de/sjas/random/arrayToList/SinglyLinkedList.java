/**
 * 
 */
package de.sjas.random.arrayToList;

/**
 * Main class for the list implementation.
 * 
 * Singly linked, head, tail, addmethods and overridden toString.
 * 
 * @author sjas
 */
public class SinglyLinkedList {

	ListElem head, tail;
	int length;

	public ListElem getHead() {
		return this.head;
	}

	public ListElem getTail() {
		return this.tail;
	}

	public boolean isEmpty() {
		if (length == 0)
			return true;
		else
			return false;
	}

	public void addIntToList(int i) {
		addListElemToList(new ListElem(i));
	}

	private void addListElemToList(ListElem x) {
		if (isEmpty()) {
			this.head = x;
			this.tail = x;
			length++;
		} else {
			this.tail.setNext(x);
			this.tail = this.tail.getNext();
			length++;
		}
	}

	public static SinglyLinkedList convertArrayIntoList(int[] as) {
		SinglyLinkedList sll = new SinglyLinkedList();
		for (int i = 0; i < as.length; i++) {
			sll.addIntToList(as[i]);
		}
		return sll;
	}

	public static int[] convertListIntoArray(SinglyLinkedList sll) {
		int[] tmp = new int[sll.length];
		if (sll.length != 0) {
			ListElem current = sll.head;
			for (int i = 0; i < sll.length; i++) {
				tmp[i] = current.data;
				current = current.getNext();
			}
		}
		return tmp;
	}

	@Override
	public String toString() {
		String temp = "List empty";
		if (this.length > 0) {
			temp = "";
			ListElem current = head;
			while ((current.getNext() != null)) {
				if (!"".equals(temp)) {
					temp = temp + " " + current.data;
					current = current.getNext();
				} else {
					temp = temp + current.data;
					current = current.getNext();
				}
			}
			temp = temp + " " + current.data;
		}
		return temp;
	}
}