package iterator.exemplo01.iterator;

import java.util.ArrayList;

import iterator.exemplo01.product.Canal;

public class IteratorListaDeCanais implements IteratorInterface {

	protected ArrayList<Canal> lista;
	protected int contador;

	public IteratorListaDeCanais(ArrayList<Canal> lista) {
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
	public Canal currentItem() {
		if (isDone()) {
			contador = lista.size() - 1;
		} else if (contador < 0) {
			contador = 0;
		}

		return lista.get(contador);
	}

}
