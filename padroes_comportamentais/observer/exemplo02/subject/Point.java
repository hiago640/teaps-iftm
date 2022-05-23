package observer.exemplo02.subject;

import java.util.ArrayList;
import java.util.List;

import observer.exemplo02.observer.Observer;

public class Point implements Subject{

	private int x;
	private int y;
	private String color;
	private List<Observer> observers;

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
	
	@Override
	public void notifyObserver() {
		for (Observer ob : observers)
			ob.update(x, y, color);
	}
	
	private void valuesChanged() {
		notifyObserver();
	}
	
	public void setValues(int x, int y, String color) {
		this.color = color;
		this.x = x;
		this.y = y;
		
		valuesChanged();
	}
	

}
