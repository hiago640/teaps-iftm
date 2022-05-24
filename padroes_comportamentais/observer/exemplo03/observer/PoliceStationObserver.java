package observer.exemplo03.observer;

import observer.exemplo03.subject.Subject;

public class PoliceStationObserver implements Observer{

	private boolean presenceSensor;
	private Subject alarmSystem;
	
	public PoliceStationObserver(Subject alarmSystem) {
		this.alarmSystem = alarmSystem;
		this.alarmSystem.registerObserver(this);
	}
	
	@Override
	public void update(boolean presenceSensor) {
		this.presenceSensor = presenceSensor;
		display();
	}
	
	private void display() {
		System.out.println(String.format("Delegacia: Status do sensor de presença: %s.", presenceSensor));
	}

}
