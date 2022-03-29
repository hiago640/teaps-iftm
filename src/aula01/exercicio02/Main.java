package aula01.exercicio02;

public class Main {
	
	public static void main(String[] args) {
		Point point = new Point();
		point.setX(10.0);
		point.setY(20.0);
		
		System.out.println();
		System.out.println("Dados da forma: " + point.Nome());
		System.out.println("X do point: " + point.getX());
		System.out.println("Y do point: " + point.getY());
		
		Circle circle = new Circle();
		circle.setRadius(10.0);
		
		System.out.println();
		System.out.println("Dados da forma: " + circle.Nome());
		System.out.println("Área do círculo: " + circle.Area());
		System.out.println("Círcunferência do círculo: " + circle.Circumference());
		System.out.println("Diamêtro do círculo: " + circle.Diameter());
		
		Cylinder cylinder = new Cylinder();
		cylinder.setRadius(2);
		cylinder.setHeight(3);

		System.out.println();
		System.out.println("Dados da forma: " + cylinder.Nome());
		System.out.println("Área do cilindro: " + cylinder.Area());
		System.out.println("Volume do círculo: " + cylinder.Volume());
		
	}
}
