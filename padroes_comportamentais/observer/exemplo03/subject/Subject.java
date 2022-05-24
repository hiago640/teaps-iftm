package observer.exemplo03.subject;

import observer.exemplo03.observer.Observer;

public interface Subject {

	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObserver();
}
