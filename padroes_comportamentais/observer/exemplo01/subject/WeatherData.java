package observer.exemplo01.subject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import observer.exemplo01.observer.Observer;

public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
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
			ob.update(temperature, humidity, pressure);
	}

	private void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMensurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		
		measurementsChanged();
	}
}
