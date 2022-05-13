package iterator.exemplo01;

import iterator.exemplo01.iterable_collection.AgregadoDeCanais;
import iterator.exemplo01.iterable_collection.CanaisEsporte;
import iterator.exemplo01.iterable_collection.CanaisFilme;
import iterator.exemplo01.iterator.IteratorInterface;

public class Cliente {

	public static void main(String[] args) {
		AgregadoDeCanais canaisDeEsporte = new CanaisEsporte();
		
		System.out.println("Canais de Esporte");
		
		for(IteratorInterface it = canaisDeEsporte.criarIterator(); !it.isDone(); it.next()) {
			System.out.println(it.currentItem().nome);
		}
		
		System.out.println("\n");
		
		AgregadoDeCanais canaisDeFilmes = new CanaisFilme();
		
		System.out.println("Canais de Filmes");
		
		for(IteratorInterface it = canaisDeFilmes.criarIterator(); !it.isDone(); it.next()) {
			System.out.println(it.currentItem().nome);
		}
	}
}
