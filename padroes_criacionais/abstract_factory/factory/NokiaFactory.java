package abstract_factory.factory;

import abstract_factory.AbstractPart;
import abstract_factory.pecas.Bateria;
import abstract_factory.pecas.Camera;
import abstract_factory.pecas.Gps;
import abstract_factory.pecas.Visor;

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
				return new Gps(MARCA);
			case VISOR:
				return new Visor(MARCA);
			default:
				return null;
		}
	}

}
