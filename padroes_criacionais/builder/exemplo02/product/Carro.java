package builder.exemplo02.product;

public class Carro {

	public double preco;
	public String dscMotor;
	public int anoDeFabricacao;
	public String modelo;
	public String montadora;

	@Override
	public String toString() {
		return String.format("Carro [preco=%s, dscMotor=%s, anoDeFabricacao=%s, modelo=%s, montadora=%s]", preco,
				dscMotor, anoDeFabricacao, modelo, montadora);
	}

}
