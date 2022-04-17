package aula01.heranca_polimorfismo;

public abstract class Shape {
	public String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double Area() {
		return 0;
	}
	public double Volume() {
		return 0;
	}
}
