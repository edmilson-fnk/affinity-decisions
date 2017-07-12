package data;

import java.util.Iterator;

public class CircularIterator<T> implements Iterator<T> {

	private Integer max;
	private Integer atual;
	private CircularLinkedList<T> lista;
	private Iterator<T> it;
	
	public CircularIterator(CircularLinkedList<T> lista) {
		this.max = null;
		inicializa(lista);
	}

	public CircularIterator(CircularLinkedList<T> lista, Integer max) {
		this.max = max;
		inicializa(lista);
	}
	
	private void inicializa(CircularLinkedList<T> lista) {
		this.lista = lista;
		this.atual = 0;
		
		novoIterator();
	}
	
	private Iterator<T> novoIterator() {
		this.it = lista.iterator();
		
		return this.it;
	}

	@Override
	public boolean hasNext() {
		return !lista.isEmpty() && noLimite();
	}

	@Override
	public T next() {
		this.atual++;
		
		return it.hasNext() ? it.next() : novoIterator().next();
	}

	private boolean noLimite() {
		return this.max == null || this.atual < this.max;
	}

}
