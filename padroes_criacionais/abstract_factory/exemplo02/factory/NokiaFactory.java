package abstract_factory.exemplo02.factory;

import abstract_factory.exemplo02.products.Bateria;
import abstract_factory.exemplo02.products.Camera;
import abstract_factory.exemplo02.products.GPS;
import abstract_factory.exemplo02.products.Visor;
import abstract_factory.exemplo02.products.nokia.BateriaNokia;
import abstract_factory.exemplo02.products.nokia.CameraNokia;
import abstract_factory.exemplo02.products.nokia.GPSNokia;
import abstract_factory.exemplo02.products.nokia.VisorNokia;

public class NokiaFactory implements CelularFactory{

	@Override
	public Bateria criaBateria() {
		return new BateriaNokia();
	}

	@Override
	public Camera criaCamera() {
		return new CameraNokia();
	}

	@Override
	public GPS criaGPS() {
		return new GPSNokia();
	}

	@Override
	public Visor criaVisor() {
		return new VisorNokia();
	}

}
