package observer.exemplo02.observer;

import observer.exemplo02.subject.Subject;

public class Screen implements Observer {

	private int x;
	private int y;
	private String color;
	public Subject screen;
	
	public Screen(Subject screen) {
		this.screen = screen;
		screen.addObserver(this);
	}
	
	@Override
	public void update(int x, int y, String color) {
		this.x = x;
		this.y = y;
		
		display();
	}

	private void display() {
		System.out.println("Propriedade alteradas: " + x + " y " + y);
	}
}
