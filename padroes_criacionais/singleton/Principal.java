package singleton;

public class Principal {
	public static void main(String[] args) {
		
		RandomNumberGenerator rng = RandomNumberGenerator.getInstance();
		
		System.out.println(rng.getRandomInt(10));
	}
}
