package observer.exemplo02.subject;

import java.util.ArrayList;
import java.util.List;

import observer.exemplo02.observer.Observer;

public class Point implements Subject{

	private int x;
	private int y;
	private String color;
	private List<Observer> observers;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Point() {
		observers = new ArrayList<>();
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	private void tamanhoAlterado() {
		notifyObserver();
	}
	
	@Override
	public void notifyObserver() {
		for (Observer ob : observers)
			ob.update(x, y, color);
	}
	
	public void setValores(int x, int y, String color) {
		this.color = color;
		this.x = x;
		this.y = y;
		
		tamanhoAlterado();
	}
	

}
