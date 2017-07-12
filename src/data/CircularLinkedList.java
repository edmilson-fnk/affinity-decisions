package data;

import java.util.Iterator;
import java.util.LinkedList;

public class CircularLinkedList<T> extends LinkedList<T> {

	private static final long serialVersionUID = -6232148058309980012L;
	
	@Override
	public Iterator<T> iterator() {
		return super.iterator();
	}

	public CircularIterator<T> circularIterator() {
		return new CircularIterator<T>(this);
	}

	public CircularIterator<T> circularIterator(Integer max) {
		return new CircularIterator<T>(this, max);
	}
	
	public static void main(String[] args) {
		CircularLinkedList<String> lista = new CircularLinkedList<String>();
		
		lista.add("oi");
		
		CircularIterator<String> it = lista.circularIterator(5);
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
