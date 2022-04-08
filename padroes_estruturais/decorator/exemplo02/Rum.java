package decorator.exemplo02;

public class Rum extends Bebidas{

	public Rum() {
		descricao = "Rum";
	}
	
	@Override
	public double getCusto() {
		return 20;
	}

}
