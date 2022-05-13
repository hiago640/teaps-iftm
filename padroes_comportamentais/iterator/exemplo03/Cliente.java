package iterator.exemplo03;

import iterator.exemplo03.iterator.IteratorInterface;
import iterator.exemplo03.iterable_collection.AgregadoFibonacci;
import iterator.exemplo03.iterable_collection.FiboCollection;

public class Cliente {

	public static void main(String[] args) {
		AgregadoFibonacci numeros = new FiboCollection();
		
		System.out.println("Números Fibonacci\n");
		
		for(IteratorInterface it = numeros.criarIterator(); !it.isDone(); it.next()) {
			System.out.println(it.currentItem().valor);
		}
		
	}
	
}
