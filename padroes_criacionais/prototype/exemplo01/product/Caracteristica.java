package prototype.exemplo01.product;

public class Caracteristica {
	private String descricao;
	private String fabricante;
	private double preco;

	public Caracteristica(String descricao, String fabricante, double preco) {
		super();
		this.descricao = descricao;
		this.fabricante = fabricante;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return String.format("Caracteristica [descricao=%s, fabricante=%s, preco=%s]", descricao, fabricante, preco);
	}

	
}
