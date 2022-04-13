package singleton.exemplo01;

import singleton.exemplo01.singleton.RandomNumberGenerator;

public class Cliente {
	public static void main(String[] args) {
		
		RandomNumberGenerator rng = RandomNumberGenerator.getInstance();
		
		System.out.println(rng.getRandomInt(10));
	}
}
