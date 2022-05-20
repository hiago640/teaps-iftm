package observer.exemplo01;

import observer.exemplo01.observer.CurrentConditionDisplay;
import observer.exemplo01.subject.WeatherData;

public class Cliente {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		new CurrentConditionDisplay(weatherData);
		
		weatherData.setMensurements(28, 58, 30);
		weatherData.setMensurements(32, 34, 25);
	}
}
