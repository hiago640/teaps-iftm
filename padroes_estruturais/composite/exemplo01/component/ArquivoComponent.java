package composite.exemplo01.component;

public class ArquivoComponent {
	public String nomeDoArquivo;

	public void printNomeDoArquivo() {
		System.out.print(" - " + this.nomeDoArquivo);
	}

	public String getNomeDoArquivo() {
		return this.nomeDoArquivo;
	}

	public void adicionar(ArquivoComponent novoArquivo) throws Exception {
		throw new Exception("Não pode inserir arquivos em: " + this.nomeDoArquivo + " - Não é uma pasta");
	}

	public void remover(String nomeDoArquivo) throws Exception {
		throw new Exception("Não pode remover arquivos em: " + this.nomeDoArquivo + " -Não é uma pasta");
	}

	public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
		throw new Exception("Não pode pesquisar arquivos em: " + this.nomeDoArquivo + " - Não é uma pasta");
	}
}
