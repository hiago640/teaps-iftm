package observer.exemplo03.observer;

import observer.exemplo03.subject.Subject;

public class InsuranceCompanyObserver implements Observer{

	private boolean presenceSensor;
	private Subject alarmSystem;
	
	public InsuranceCompanyObserver(Subject alarmSystem) {
		this.alarmSystem = alarmSystem;
		this.alarmSystem.registerObserver(this);
	}
	
	@Override
	public void update(boolean presenceSensor) {
		this.presenceSensor = presenceSensor;
		display();
	}
	
	private void display() {
		System.out.println(String.format("Companhia de Seguros: Status do sensor de presença: %s.", presenceSensor));
	}

}
