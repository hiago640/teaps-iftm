package builder.exemplo02.builder;

import builder.exemplo02.product.Carro;

public abstract class CarroBuilder {

	protected Carro carro;

	public void createNewCarro() {
		carro = new Carro();
	}

	public abstract void buildPreco();

	public abstract void buildDscMotor();

	public abstract void buildAnoDeFabricacao();

	public abstract void buildModelo();

	public abstract void buildMontadora();

	public Carro getCarro() {
		return carro;
	}

}
