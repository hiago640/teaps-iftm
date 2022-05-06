package command.exemplo01.command;

import command.exemplo01.receiver.Robo;

public class RotacionarCommand extends RoboCommand{

	public double rotacionarParaEsquerda;
	
	public RotacionarCommand(Robo robo) {
		super(robo);
	}

	@Override
	public void executar() {
		robo.rotacionarParaEsquerda(rotacionarParaEsquerda);
	}

	@Override
	public void desfazer() {
		robo.rotacionarParaEsquerda(- rotacionarParaEsquerda);
	}
	
}
