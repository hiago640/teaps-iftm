package aula01.exemplo03;

public class Main {
	
	public static void main(String[] args) {
		
		Soma sum = new Soma();
		System.out.println("sum: " + sum.calcular());
		
		Multiplicacao mult = new Multiplicacao();
		System.out.println("mult: " + mult.calcular());
		
	}
}
