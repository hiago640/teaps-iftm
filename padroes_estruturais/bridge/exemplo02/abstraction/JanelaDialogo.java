package bridge.exemplo02.abstraction;

import bridge.exemplo02.implementation.JanelaImplementada;

public class JanelaDialogo extends JanelaAbstrata {
	
	public JanelaDialogo(JanelaImplementada j) {
		super(j);
	}

	@Override
	public void desenhar() {
		desenharJanela("Janela de Diálogo");
		desenharBotao("Botão Sim");
		desenharBotao("Botão Não");
		desenharBotao("Botão Cancelar");
	}
}
