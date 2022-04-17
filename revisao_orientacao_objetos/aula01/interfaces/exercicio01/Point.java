package aula01.interfaces.exercicio01;

public class Point implements Shape{
	private double x;
	private double y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String Nome() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double Area() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double Volume() {
		// TODO Auto-generated method stub
		return 0;
	}


	
}
