package iterator.exemplo02.iterator;

import iterator.exemplo02.product.Book;

public interface IteratorInterface {
	
	void first();
	void next();
	boolean isDone();
	
	Book currentItem();
}
