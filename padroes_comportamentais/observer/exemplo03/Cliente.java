package observer.exemplo03;

import observer.exemplo03.observer.InsuranceCompanyObserver;
import observer.exemplo03.observer.PoliceStationObserver;
import observer.exemplo03.subject.AlarmSystem;

public class Cliente {

	public static void main(String[] args) {

		AlarmSystem alarmSystem = new AlarmSystem();
		new PoliceStationObserver(alarmSystem);
		new InsuranceCompanyObserver(alarmSystem);

		alarmSystem.setSensors(false);
		System.out.println();
		alarmSystem.setSensors(true);


	}
}
