package aula04.lista01.exercicio03;

public class Principal {
	public static void main(String[] args) {
		
		RandomNumberGenerator rng = RandomNumberGenerator.getInstance();
		
		System.out.println(rng.getRandomInt(10));
	}
}
