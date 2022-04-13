package builder.exemplo02.builder;

public class VolksBuilder extends CarroBuilder{

	@Override
	public void buildPreco() {
		carro.preco = 30000.00;
	}

	@Override
	public void buildDscMotor() {
		carro.dscMotor = "1.0";
	}

	@Override
	public void buildAnoDeFabricacao() {
		carro.anoDeFabricacao = 2010;
	}

	@Override
	public void buildModelo() {
		carro.modelo = "Gol G5";
	}

	@Override
	public void buildMontadora() {
		carro.montadora = "Volkswagen";
	}

}
