package visitor.exemplo02.element;

import visitor.exemplo02.visitor.Visitor;

public class Wheel {

	private String name;

	public Wheel(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
