package composite.exemplo02.component;

public abstract class ItemComponent {
	public String nomeItem;
	public double valor;

	public void printNomeItem() {
		System.out.print(" - " + this.nomeItem);
	}

	public String getNomeItem() {
		return this.nomeItem;
	}

	public void adicionar(ItemComponent item) throws Exception {
		throw new Exception("Não pode inserir item em: " + this.nomeItem + " - Não é uma Caixa");
	}

	public void remover(String nomeDoArquivo) throws Exception {
		throw new Exception("Não pode remover item em: " + this.nomeItem + " -Não é uma Caixa");
	}

	public ItemComponent getProduto(String nomeProduto) throws Exception {
		throw new Exception("Não pode pesquisar item em: " + this.nomeItem + " - Não é uma Caixa");
	}
	
	public double calculaValorTotal() {
		return this.valor;
	}
	
	public void mostraTotal() {
		System.out.println(this.calculaValorTotal());
	}
}
