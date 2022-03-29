package aula01.exercicio01;

public class Circle extends Point{
	private double radius;
	
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double Area() {
		double area =  (Math.PI * Math.pow(getRadius(), 2));
		return area;
	}
	
	public double Diameter() {
		return getRadius() * 2;
	}
	
	public double Circumference() {
		return (Math.PI * Diameter());
	}
}
