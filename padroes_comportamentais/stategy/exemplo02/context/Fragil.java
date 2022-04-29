package stategy.exemplo02.context;

import stategy.exemplo02.strategy.AtacarSozinho;

public class Fragil extends Inimigo {

	public Fragil() {
		estrategia = new AtacarSozinho();
	}

	@Override
	public void informacoes() {
		System.out.println("Inimigo: Frágil");
	}

}
