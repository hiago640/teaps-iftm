package iterator.exemplo03.iterable_collection;

import java.util.ArrayList;

import iterator.exemplo03.iterator.FiboIterator;
import iterator.exemplo03.iterator.IteratorInterface;
import iterator.exemplo03.product.Fibonacci;

public class FiboCollection implements AgregadoFibonacci{
	protected ArrayList<Fibonacci> numeros;
	
	public FiboCollection() {
		numeros = new ArrayList<>();
		numeros.add(new Fibonacci(0));
		numeros.add(new Fibonacci(1));
		numeros.add(new Fibonacci(1));
		numeros.add(new Fibonacci(2));
		numeros.add(new Fibonacci(3));
		numeros.add(new Fibonacci(5));
		numeros.add(new Fibonacci(8));
		numeros.add(new Fibonacci(13));
	}
	
	@Override
	public IteratorInterface criarIterator() {
		return new FiboIterator(numeros);
	}

}
