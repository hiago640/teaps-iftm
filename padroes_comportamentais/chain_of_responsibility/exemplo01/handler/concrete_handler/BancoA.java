package chain_of_responsibility.exemplo01.handler.concrete_handler;

import chain_of_responsibility.exemplo01.handler.BancoChain;
import chain_of_responsibility.exemplo01.handler.BancoEnum;

public class BancoA extends BancoChain {

	public BancoA(BancoEnum banco) {
		super(banco);
	}

	@Override
	public void efetuarPagamento() {
		System.out.println("Pagamento efetuado no Banco A");
	}

}
