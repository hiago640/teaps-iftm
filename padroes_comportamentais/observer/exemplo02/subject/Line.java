package observer.exemplo02.subject;

import java.util.ArrayList;
import java.util.List;

import observer.exemplo02.observer.Observer;

public class Line implements Subject{

	private int p1;
	private int p2;
	private String color;
	private List<Observer> observers;

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Line() {
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
			ob.update(p1, p2, color);
	}
	
	public void setValores(int p1, int p2, String color) {
		this.color = color;
		this.p1 = p1;
		this.p2 = p2;
		
		tamanhoAlterado();
	}
	

}
