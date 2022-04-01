package abstract_factory;

public abstract class AbstractPart {
	
	private String marca;
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public AbstractPart(String marca) {
		this.marca = marca;
	}
	
	public String toString() {
		return "Marca " + this.marca;
	}
}
