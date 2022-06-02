package visitor.exemplo02;

import visitor.exemplo02.element.Car;
import visitor.exemplo02.visitor.DoVisitor;
import visitor.exemplo02.visitor.PrintVisitor;
import visitor.exemplo02.visitor.Visitor;

public class Cliente {

	public static void main(String[] args) {
		Car car = new Car();
		Visitor printVisitor = new PrintVisitor();
		Visitor doVisitor = new DoVisitor();
		
		car.accept(printVisitor);
		car.accept(doVisitor);
	}
	
}
