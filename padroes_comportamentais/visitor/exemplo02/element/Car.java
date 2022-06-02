package visitor.exemplo02.element;

import visitor.exemplo02.visitor.Visitor;

public class Car extends Vehicle {

	public Car() {
		super();
		this.wheels = new Wheel[] {
			new Wheel("front left"),
			new Wheel("front right"),
			new Wheel("back left"),
			new Wheel("back right"),
		};
	}
	
	public void accept(Visitor visitor) {
		visitor.visitCar(this);
	}
}
