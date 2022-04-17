package prototype.exemplo02.product;

public class FormaGeometrica implements Cloneable{
	
	public int lados;
	public String nome;
	
	public FormaGeometrica(int lados, String nome) {
		this.lados = lados;
		this.nome = nome;
	}

	public FormaGeometrica clone() throws CloneNotSupportedException {
		return (FormaGeometrica) super.clone();
	}

	@Override
	public String toString() {
		return String.format("FormaGeometrica [lados=%s, nome=%s]", lados, nome);
	}
	
}
