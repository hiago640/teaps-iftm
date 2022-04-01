package abstract_factory.pecas;

import abstract_factory.AbstractPart;

public class Bateria extends AbstractPart{

	public Bateria(String marca) {
		super(marca);
	}
	
	@Override
	public String toString() {
		return "Bateria " + getMarca();
	}
	
}
