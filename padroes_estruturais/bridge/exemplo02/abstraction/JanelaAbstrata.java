package bridge.exemplo02.abstraction;

import bridge.exemplo02.implementation.JanelaImplementada;

public abstract class JanelaAbstrata {
	public JanelaImplementada janela;

	public JanelaAbstrata(JanelaImplementada j) {
		janela = j;
	}

	public void desenharJanela(String titulo) {
		janela.desenharJanela(titulo);
	}

	public void desenharBotao(String titulo) {
		janela.desenharBotao(titulo);
	}

	public abstract void desenhar();
}
