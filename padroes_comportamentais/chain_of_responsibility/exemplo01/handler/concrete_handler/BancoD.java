package chain_of_responsibility.exemplo01.handler.concrete_handler;

import chain_of_responsibility.exemplo01.handler.BancoChain;
import chain_of_responsibility.exemplo01.handler.BancoEnum;

public class BancoD extends BancoChain {

	public BancoD(BancoEnum banco) {
		super(banco);
	}

	@Override
	public void efetuarPagamento() {
		System.out.println("Pagamento efetuado no Banco D");
	}

}
