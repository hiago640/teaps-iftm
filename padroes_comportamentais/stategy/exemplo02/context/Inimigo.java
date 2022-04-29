package stategy.exemplo02.context;

import stategy.exemplo02.strategy.Estrategia;

public abstract class Inimigo {

	protected Estrategia estrategia;
	
	public abstract void informacoes();
	
	public void iniciarGuerra() {
		System.out.println("\nIniciar Guerra:");
		estrategia.iniciar();
	}
	
	public void concluirGuerra() {
		System.out.println("\nConcluir Guerra:");
		estrategia.concluir();
	}
}
