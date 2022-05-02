package chain_of_responsibility.exemplo02.handler.concrete_handler;

import java.math.BigDecimal;

import chain_of_responsibility.exemplo02.handler.ConvertHandler;
import chain_of_responsibility.exemplo02.handler.MoedaEnum;

public class ConcreteRSHandler extends ConvertHandler {

	public ConcreteRSHandler(MoedaEnum moeda) {
		super(moeda);
	}

	@Override
	public void handleConversion(String input) {
		BigDecimal inputValue = new BigDecimal(input);
		BigDecimal real = BigDecimal.valueOf(5.27);

		System.out.println("Euro -> Real\nR$: " + inputValue.multiply(real));
	}

}
