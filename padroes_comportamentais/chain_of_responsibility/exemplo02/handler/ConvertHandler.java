package chain_of_responsibility.exemplo02.handler;

public abstract class ConvertHandler {

	protected ConvertHandler next;
	protected MoedaEnum moeda;

	public ConvertHandler(MoedaEnum moeda) {
		this.next = null;
		this.moeda = moeda;
	}

	public void setNextHandler(ConvertHandler handler) {
		if (next == null)
			this.next = handler;
		else
			next.setNextHandler(handler);
	}

	public void efetuaConversao(MoedaEnum moeda, String input) throws Exception {
		if (podeEfetuarConversao(moeda)) {
			handleConversion(input);
		} else {
			if (next == null)
				throw new Exception("Moeda não cadastrada");

			next.efetuaConversao(moeda, input);
		}

	}

	public abstract void handleConversion(String input);

	private boolean podeEfetuarConversao(MoedaEnum moeda) {
		return this.moeda.equals(moeda);
	}
}
