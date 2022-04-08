package decorator.exemplo02;

public abstract class Bebidas {

	public double custo;

	protected String descricao;
	
	public abstract double getCusto();
	
	public String getDescricao() {
		return descricao;
	};
}
