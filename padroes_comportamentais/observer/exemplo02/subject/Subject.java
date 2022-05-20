package observer.exemplo02.subject;

import observer.exemplo02.observer.Observer;

public interface Subject {

	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
