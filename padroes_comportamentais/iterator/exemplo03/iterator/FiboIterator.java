package iterator.exemplo03.iterator;

import java.util.ArrayList;

import iterator.exemplo03.product.Fibonacci;

public class FiboIterator implements IteratorInterface{

	protected ArrayList<Fibonacci> lista;
	protected int contador;

	public FiboIterator(ArrayList<Fibonacci> lista) {
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
	public Fibonacci currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}

		return lista.get(contador);
	}


}
