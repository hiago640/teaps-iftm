package decorator.exemplo02;

public class Cachaca extends Bebidas{

	public Cachaca() {
		descricao = "Cachaça";
	}
	
	@Override
	public double getCusto() {
		return 40;
	}

}
