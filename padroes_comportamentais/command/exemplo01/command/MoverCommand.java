package command.exemplo01.command;

import command.exemplo01.receiver.Robo;

public class MoverCommand extends RoboCommand{

	public int paraFrente;
	
	public MoverCommand(Robo robo) {
		super(robo);
	}

	@Override
	public void executar() {
		robo.mover(paraFrente);
	}

	@Override
	public void desfazer() {
		robo.mover(- paraFrente);
	}
	
}
