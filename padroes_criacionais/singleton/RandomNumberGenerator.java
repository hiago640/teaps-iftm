package singleton;

import java.util.Random;

public class RandomNumberGenerator {

	private static RandomNumberGenerator uniqueInstance;

	public static RandomNumberGenerator getInstance() {

		if (uniqueInstance == null)
			uniqueInstance = new RandomNumberGenerator();
		return uniqueInstance;
	}
	
	public int getRandomInt(int maxNumber) {
		Random r = new Random();
		return r.nextInt(maxNumber);
	}
}
