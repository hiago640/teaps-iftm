package chain_of_responsibility.exemplo01.handler.concrete_handler;

import chain_of_responsibility.exemplo01.handler.BancoChain;
import chain_of_responsibility.exemplo01.handler.BancoEnum;

public class BancoC extends BancoChain {

	public BancoC(BancoEnum banco) {
		super(banco);
	}

	@Override
	public void efetuarPagamento() {
		System.out.println("Pagamento efetuado no Banco C");
	}

}
