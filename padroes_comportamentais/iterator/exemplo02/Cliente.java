package iterator.exemplo02;

import iterator.exemplo02.iterator.IteratorInterface;
import iterator.exemplo02.iterable_collection.AgregadoDeLivros;
import iterator.exemplo02.iterable_collection.BooksCollection;

public class Cliente {
	public static void main(String[] args) {
		AgregadoDeLivros livros = new BooksCollection();
		
		System.out.println("Livros");
		
		for(IteratorInterface it = livros.criarIterator(); !it.isDone(); it.next()) {
			System.out.println(it.currentItem().nome);
		}
		
	}
}
