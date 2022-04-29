package chain_of_responsibility.exemplo01.handler;

public abstract class BancoChain {

	protected BancoChain next;
	protected BancoEnum banco;

	public BancoChain(BancoEnum banco) {
		this.next = null;
		this.banco = banco;
	}

	public void setNext(BancoChain banco) {
		if (next == null)
			this.next = banco;
		else
			next.setNext(banco);
	}

	public void efetuaPagamento(BancoEnum banco) throws Exception {
		if (podeEfetuarPagamento(banco)) {
			efetuarPagamento();
		} else {
			if (next == null)
				throw new Exception("Banco não cadastrado");

			next.efetuaPagamento(banco);
		}

	}

	public abstract void efetuarPagamento();

	private boolean podeEfetuarPagamento(BancoEnum banco) {
		return this.banco.equals(banco);
	}
}
