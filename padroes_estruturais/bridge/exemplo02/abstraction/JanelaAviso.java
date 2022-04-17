package bridge.exemplo02.abstraction;

import bridge.exemplo02.implementation.JanelaImplementada;

public class JanelaAviso extends JanelaAbstrata {
	
	public JanelaAviso(JanelaImplementada j) {
		super(j);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Aviso");
		desenharBotao("Ok");
	}
}
