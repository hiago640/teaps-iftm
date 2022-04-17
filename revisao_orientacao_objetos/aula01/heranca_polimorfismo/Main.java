package aula01.heranca_polimorfismo;

public class Main {
	
	public static void main(String[] args) {
		Point point = new Point();
		point.setNome("Ponto");
		point.setX(10.0);
		point.setY(20.0);
		
		System.out.println();
		System.out.println("Dados da forma: " + point.getNome());
		System.out.println("X do point: " + point.getX());
		System.out.println("Y do point: " + point.getY());
		
		Circle circle = new Circle();
		circle.setNome("C�rculo");
		circle.setRadius(10.0);
		
		System.out.println();
		System.out.println("Dados da forma: " + circle.getNome());
		System.out.println("�rea do c�rculo: " + circle.Area());
		System.out.println("C�rcunfer�ncia do c�rculo: " + circle.Circumference());
		System.out.println("Diam�tro do c�rculo: " + circle.Diameter());
		
		Cylinder cylinder = new Cylinder();
		cylinder.setNome("Cilindro");
		cylinder.setRadius(2);
		cylinder.setHeight(3);

		System.out.println();
		System.out.println("Dados da forma: " + cylinder.getNome());
		System.out.println("�rea do cilindro: " + cylinder.Area());
		System.out.println("Volume do c�rculo: " + cylinder.Volume());
		
	}
}
