package decorator.exemplo02;

public class Tequila extends Bebidas{

	public Tequila() {
		descricao = "Tequila";
	}
	
	@Override
	public double getCusto() {
		return 10;
	}

}
