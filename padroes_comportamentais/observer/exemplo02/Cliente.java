package observer.exemplo02;

import observer.exemplo02.observer.Screen;
import observer.exemplo02.subject.Line;
import observer.exemplo02.subject.Point;

public class Cliente {
	
	public static void main(String[] args) {
		Line line = new Line();
		Point point = new Point();
		Screen screen = new Screen(line);
		
		line.setValores(28, 58, "ROXO");
		line.setValores(60, 58, "VERDE");
	}
}
