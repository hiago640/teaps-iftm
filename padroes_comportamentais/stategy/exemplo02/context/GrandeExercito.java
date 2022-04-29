package stategy.exemplo02.context;

import stategy.exemplo02.strategy.AliancaComVizinho;

public class GrandeExercito extends Inimigo{

	public GrandeExercito() {
		estrategia = new AliancaComVizinho();
	}
	
	@Override
	public void informacoes() {
		System.out.println("Inimigo: Grande Exército");
	}

}
