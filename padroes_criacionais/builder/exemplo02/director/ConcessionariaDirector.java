package builder.exemplo02.director;

import builder.exemplo02.builder.CarroBuilder;
import builder.exemplo02.product.Carro;

public class ConcessionariaDirector {
	protected CarroBuilder carroObject;

	public ConcessionariaDirector(CarroBuilder carroObject) {
		this.carroObject = carroObject;
	}

	public void construirCarro() {
		carroObject.createNewCarro();
		carroObject.buildPreco();
		carroObject.buildAnoDeFabricacao();
		carroObject.buildDscMotor();
		carroObject.buildModelo();
		carroObject.buildMontadora();
	}

	public Carro getCarro() {
		return carroObject.getCarro();
	}
}
