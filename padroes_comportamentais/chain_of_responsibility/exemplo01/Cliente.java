package chain_of_responsibility.exemplo01;

import chain_of_responsibility.exemplo01.handler.BancoChain;
import chain_of_responsibility.exemplo01.handler.BancoEnum;
import chain_of_responsibility.exemplo01.handler.concrete_handler.BancoA;
import chain_of_responsibility.exemplo01.handler.concrete_handler.BancoB;
import chain_of_responsibility.exemplo01.handler.concrete_handler.BancoC;
import chain_of_responsibility.exemplo01.handler.concrete_handler.BancoD;
import chain_of_responsibility.exemplo01.handler.concrete_handler.BancoE;

public class Cliente {

	public static void main(String[] args) {
		BancoChain bancosList = new BancoA(BancoEnum.BANCO_A);
		bancosList.setNext(new BancoB(BancoEnum.BANCO_B));
		bancosList.setNext(new BancoC(BancoEnum.BANCO_C));
		bancosList.setNext(new BancoD(BancoEnum.BANCO_D));
		bancosList.setNext(new BancoE(BancoEnum.BANCO_E));

		try {
			bancosList.efetuaPagamento(BancoEnum.BANCO_C);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
