package visitor.exemplo02.visitor;

import visitor.exemplo02.element.Body;
import visitor.exemplo02.element.Car;
import visitor.exemplo02.element.Engine;
import visitor.exemplo02.element.Vehicle;
import visitor.exemplo02.element.Wheel;

public interface Visitor {
	
	void visit(Wheel wheel);
	void visit(Engine engine);
	void visit(Body body);
	void visitCar(Car car);
	void visitVehicle(Vehicle vehicle);
}
