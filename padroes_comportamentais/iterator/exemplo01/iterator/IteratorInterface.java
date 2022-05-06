package iterator.exemplo01.iterator;

import iterator.exemplo01.product.Canal;

public interface IteratorInterface {
	
	void first();
	void next();
	boolean isDone();
	
	Canal currentItem();
}
