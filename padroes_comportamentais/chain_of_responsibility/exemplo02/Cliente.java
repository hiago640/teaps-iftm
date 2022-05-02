package chain_of_responsibility.exemplo02;

import chain_of_responsibility.exemplo02.handler.ConvertHandler;
import chain_of_responsibility.exemplo02.handler.MoedaEnum;
import chain_of_responsibility.exemplo02.handler.concrete_handler.ConcreteCNYHandler;
import chain_of_responsibility.exemplo02.handler.concrete_handler.ConcreteRSHandler;
import chain_of_responsibility.exemplo02.handler.concrete_handler.ConcreteUSDHandler;

public class Cliente {
	public static void main(String[] args) {
		ConvertHandler moedasList = new ConcreteRSHandler(MoedaEnum.RS);
		moedasList.setNextHandler(new ConcreteUSDHandler(MoedaEnum.USD));
		moedasList.setNextHandler(new ConcreteCNYHandler(MoedaEnum.CNY));

		try {
			System.out.println("2 Euros como input\n");
			moedasList.efetuaConversao(MoedaEnum.USD, "2");
			moedasList.efetuaConversao(MoedaEnum.CNY, "2");
			moedasList.efetuaConversao(MoedaEnum.RS, "2");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
