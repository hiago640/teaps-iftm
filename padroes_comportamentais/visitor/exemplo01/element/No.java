package visitor.exemplo01.element;

public class No {
	
	protected int chave;
	No esquerdo;
	No direito;
	
	public No(int chave) {
		this.chave = chave;
		esquerdo = null;
		direito = null;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public No getEsquerdo() {
		return esquerdo;
	}

	public void setEsquerdo(No esquerdo) {
		this.esquerdo = esquerdo;
	}

	public No getDireito() {
		return direito;
	}

	public void setDireito(No direito) {
		this.direito = direito;
	}
	
}
