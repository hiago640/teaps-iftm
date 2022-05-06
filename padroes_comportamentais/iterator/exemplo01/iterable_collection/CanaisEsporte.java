package iterator.exemplo01.iterable_collection;

import java.util.ArrayList;

import iterator.exemplo01.iterator.IteratorInterface;
import iterator.exemplo01.iterator.IteratorListaDeCanais;
import iterator.exemplo01.product.Canal;

public class CanaisEsporte implements AgregadoDeCanais{

	protected ArrayList<Canal> canais;
	
	public CanaisEsporte() {
		canais = new ArrayList<Canal>();
		canais.add(new Canal("Esporte ao vivo"));
		canais.add(new Canal("Basquete 2011"));
		canais.add(new Canal("Campeonato Italiano"));
		canais.add(new Canal("Campeonato Espanhol"));
	}
	
	@Override
	public IteratorInterface criarIterator() {
		return new IteratorListaDeCanais(canais);
	}

}
