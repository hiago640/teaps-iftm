package aula01.exemplo02;

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
		return 2 * Math.PI * getRadius() * (getRadius() + getHeight());
	}
	
	public double Volume() {
		return Math.PI * Math.pow(getRadius(),2) * getHeight();
	}
	
	@Override
	public String Nome() {
		return "Cylinder";
	}
}
