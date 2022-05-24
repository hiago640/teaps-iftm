package observer.exemplo03.subject;

import java.util.ArrayList;
import java.util.List;

import observer.exemplo03.observer.Observer;

public class AlarmSystem implements Subject {

	private List<Observer> observers;
	private boolean presenceSensor;

	public AlarmSystem() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObserver() {
		for (Observer ob : observers)
			ob.update(presenceSensor);
	}

	private void sensorsChanged() {
		notifyObserver();
	}

	public void setSensors(boolean presenceSensor) {
		this.presenceSensor = presenceSensor;

		if(presenceSensor)
			sensorsChanged();
	}

}
