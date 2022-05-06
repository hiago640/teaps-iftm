package command.exemplo01.command;

import command.exemplo01.receiver.Robo;

public abstract class RoboCommand {
	
	protected Robo robo;
	
	public RoboCommand(Robo robo) {
		this.robo = robo;
	}
	
	public abstract void executar();
	public abstract void desfazer();
}
