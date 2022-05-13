package iterator.exemplo03.iterator;

import iterator.exemplo03.product.Fibonacci;

public interface IteratorInterface {
	void first();
	void next();
	boolean isDone();
	
	Fibonacci currentItem();
}
