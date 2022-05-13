package iterator.exemplo01.iterator;

import iterator.exemplo01.product.Canal;

public class IteratorVetorDeCanais implements IteratorInterface {

	protected Canal[] lista;
	protected int contador;

	public IteratorVetorDeCanais(Canal[] lista) {
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
		return contador == lista.length;
	}

	@Override
	public Canal currentItem() {
		if (isDone()) {
			contador = lista.length - 1;
		} else if (contador < 0) {
			contador = 0;
		}

		return lista[contador];
	}

}
