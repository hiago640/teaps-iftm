package iterator.exemplo01.iterable_collection;

import java.util.ArrayList;

import iterator.exemplo01.iterator.IteratorInterface;
import iterator.exemplo01.iterator.IteratorListaDeCanais;
import iterator.exemplo01.product.Canal;

public class CanaisFilme {
	protected Canal[] canais;
	
	public CanaisFilme() {
		canais = new ArrayList<Canal>();
		canais.add(new Canal("Telecine"));
		canais.add(new Canal("HBO"));
		canais.add(new Canal("Amazon Prime"));
		canais.add(new Canal("Disney+"));
	}
	
	@Override
	public IteratorInterface criarIterator() {
		return new IteratorListaDeCanais(canais);
	}

}
