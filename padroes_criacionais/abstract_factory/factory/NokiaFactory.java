package abstract_factory.factory;

import abstract_factory.AbstractPart;
import abstract_factory.exemplo02.products.Bateria;
import abstract_factory.exemplo02.products.Camera;
import abstract_factory.exemplo02.products.GPS;
import abstract_factory.exemplo02.products.Visor;

public class NokiaFactory implements FactoryInterface {

	private static final String MARCA = "Nokia";
	
	@Override
	public AbstractPart createParte(ParteCelularEnum tipoParte) {
		
		
		switch (tipoParte) {
			case BATERIA:
				return new Bateria(MARCA);
			case CAMERA:
				return new Camera(MARCA);
			case GPS:
				return new GPS(MARCA);
			case VISOR:
				return new Visor(MARCA);
			default:
				return null;
		}
	}

}
