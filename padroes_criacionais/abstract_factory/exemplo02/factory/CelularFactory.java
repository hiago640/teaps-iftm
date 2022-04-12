package abstract_factory.exemplo02.factory;

import abstract_factory.exemplo02.products.Bateria;
import abstract_factory.exemplo02.products.Camera;
import abstract_factory.exemplo02.products.GPS;
import abstract_factory.exemplo02.products.Visor;

public interface CelularFactory {
	
	public Bateria criaBateria();
	
	public Camera criaCamera();
	
	public GPS criaGPS();
	
	public Visor criaVisor();
}
