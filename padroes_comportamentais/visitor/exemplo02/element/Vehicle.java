package visitor.exemplo02.element;

import visitor.exemplo02.visitor.Visitor;

public abstract class Vehicle {

	protected Engine engine = new Engine();
	protected Body body = new Body();
	protected Wheel[] wheels;

	public Engine getEngine() {
		return engine;
	}

	public Body getBody() {
		return body;
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void accept(Visitor visitor) {
		visitor.visitVehicle(this);
	}

}
