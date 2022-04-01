package abstract_factory.factory;

import abstract_factory.AbstractPart;

public interface FactoryInterface {
	
	public AbstractPart createParte(ParteCelularEnum tipoParte);
}
