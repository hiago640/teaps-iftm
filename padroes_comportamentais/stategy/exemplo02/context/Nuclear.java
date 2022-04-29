package stategy.exemplo02.context;

import stategy.exemplo02.strategy.Diplomacia;

public class Nuclear extends Inimigo{

	public Nuclear() {
		estrategia = new Diplomacia();
	}
	
	@Override
	public void informacoes() {
		System.out.println("Inimigo: Núclear");
	}

}
