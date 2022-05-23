package observer.exemplo02;

import observer.exemplo02.observer.Screen;
import observer.exemplo02.subject.Line;
import observer.exemplo02.subject.Point;

public class Cliente {
	
	public static void main(String[] args) {
		Line line = new Line();
		Point point = new Point();
		new Screen(line);
		new Screen(point);
		
		line.setValues(28, 58, "linha ROXO");
		point.setValues(60, 58, "ponto VERDE");
	}
}
