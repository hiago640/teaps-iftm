package prototype.exemplo01.product;

public class Produto implements Cloneable {
	private String classificacao;
	private String categoria;
	private Caracteristica caracteristica;
	
	public Produto(String classificacao, String categoria) {
		super();
		this.classificacao = classificacao;
		this.categoria = categoria;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public Produto clone() throws CloneNotSupportedException {
		return (Produto) super.clone();
	}

	@Override
	public String toString() {
		return String.format("Produto [classificacao=%s, categoria=%s, caracteristica=%s]", classificacao, categoria,
				caracteristica);
	}
	
	
}
