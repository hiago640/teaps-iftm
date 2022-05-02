package chain_of_responsibility.exemplo02.handler.concrete_handler;

import java.math.BigDecimal;

import chain_of_responsibility.exemplo02.handler.ConvertHandler;
import chain_of_responsibility.exemplo02.handler.MoedaEnum;

public class ConcreteUSDHandler extends ConvertHandler {

	public ConcreteUSDHandler(MoedaEnum moeda) {
		super(moeda);
	}

	@Override
	public void handleConversion(String input) {
		BigDecimal inputValue = new BigDecimal(input);
		BigDecimal dolar = BigDecimal.valueOf(1.05);

		System.out.println("Euro -> Dolar\nUSD: " + inputValue.multiply(dolar));
	}

}
