package composite;

public class Celula {
	private String conteudo;

	public Celula(String conteudo) {
		this.conteudo = conteudo;
	}

	public void imprimir() {
		conteudo = conteudo + "               ";
		conteudo = conteudo.substring(0, 15);
		System.out.println(" | " + conteudo);
	}
}
