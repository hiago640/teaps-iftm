package observer.exemplo01.observer;

import observer.exemplo01.subject.Subject;

public class CurrentConditionDisplay implements Observer{

	private float temperature;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentConditionDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	private void display() {
		System.out.println("Condições atuais: " + temperature + " Celsius e " + humidity + "% humidade");
	}
}
