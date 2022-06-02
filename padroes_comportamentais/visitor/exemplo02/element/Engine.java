package visitor.exemplo02.element;

import visitor.exemplo02.visitor.Visitor;

public class Engine {
	
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
