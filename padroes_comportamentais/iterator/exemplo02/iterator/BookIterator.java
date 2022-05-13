package iterator.exemplo02.iterator;

import java.util.ArrayList;

import iterator.exemplo02.product.Book;

public class BookIterator implements IteratorInterface {

	protected ArrayList<Book> lista;
	protected int contador;

	public BookIterator(ArrayList<Book> lista) {
		this.lista = lista;
		contador = 0;
	}

	@Override
	public void first() {
		contador = 0;
	}

	@Override
	public void next() {
		contador++;
	}

	@Override
	public boolean isDone() {
		return contador == lista.size();
	}

	@Override
	public Book currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}

		return lista.get(contador);
	}

}
