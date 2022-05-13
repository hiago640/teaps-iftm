package iterator.exemplo02.iterable_collection;

import java.util.ArrayList;

import iterator.exemplo02.iterator.BookIterator;
import iterator.exemplo02.iterator.IteratorInterface;
import iterator.exemplo02.product.Book;

public class BooksCollection implements AgregadoDeLivros {
protected ArrayList<Book> books;
	
	public BooksCollection() {
		books = new ArrayList<>();
		books.add(new Book("It a coisa"));
		books.add(new Book("A Guerra dos Tronos"));
		books.add(new Book("Battle Royal"));
		books.add(new Book("Duna"));
	}
	
	@Override
	public IteratorInterface criarIterator() {
		return new BookIterator(books);
	}
}
