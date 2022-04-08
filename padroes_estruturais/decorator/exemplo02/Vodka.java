package decorator.exemplo02;

public class Vodka extends Bebidas{

	public Vodka() {
		descricao = "Vodka";
	}
	
	@Override
	public double getCusto() {
		return 20;
	}
}
