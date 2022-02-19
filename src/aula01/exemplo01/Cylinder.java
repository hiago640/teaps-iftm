package aula01.exemplo01;

public class Cylinder extends Circle {
	private double height;
	

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double Area() {
		double areaBase = Math.PI * getRadius() *  getHeight();
		double areaLado =  2 * (Math.PI * getRadius() * getHeight());
		
		return (2 * areaBase + areaLado);
	}
	
	public double Volume() {
		return (getRadius() * getHeight());
	}
}
