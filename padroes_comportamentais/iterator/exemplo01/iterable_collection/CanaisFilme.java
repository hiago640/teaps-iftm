package iterator.exemplo01.iterable_collection;

import iterator.exemplo01.iterator.IteratorInterface;
import iterator.exemplo01.iterator.IteratorVetorDeCanais;
import iterator.exemplo01.product.Canal;

public class CanaisFilme implements AgregadoDeCanais{
	protected Canal[] canais;
	
	public CanaisFilme() {
		canais = new Canal[4];
		canais[0] = new Canal("Telecine");
		canais[1] = new Canal("HBO");
		canais[2] = new Canal("Amazon Prime");
		canais[3] = new Canal("Disney+");
	}
	
	@Override
	public IteratorInterface criarIterator() {
		return new IteratorVetorDeCanais(canais);
	}

}
