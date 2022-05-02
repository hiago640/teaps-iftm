package chain_of_responsibility.exemplo02.handler.concrete_handler;

import java.math.BigDecimal;

import chain_of_responsibility.exemplo02.handler.ConvertHandler;
import chain_of_responsibility.exemplo02.handler.MoedaEnum;

public class ConcreteCNYHandler extends ConvertHandler {

	public ConcreteCNYHandler(MoedaEnum moeda) {
		super(moeda);
	}

	@Override
	public void handleConversion(String input) {
		BigDecimal inputValue = new BigDecimal(input);
		BigDecimal remimbi = BigDecimal.valueOf(6.95);

		System.out.println("Euro -> Yuan Chines\nCNY: " + inputValue.multiply(remimbi));
	}

}
