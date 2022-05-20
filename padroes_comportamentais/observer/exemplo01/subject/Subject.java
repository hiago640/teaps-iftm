package observer.exemplo01.subject;

import observer.exemplo01.observer.Observer;

public interface Subject {

	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
