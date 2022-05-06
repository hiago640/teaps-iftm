package command.exemplo01.command;

import command.exemplo01.receiver.Robo;

public class EscavarCommand extends RoboCommand{
	
	public boolean colherMaterial;
	
	public EscavarCommand(Robo robo) {
		super(robo);
	}

	@Override
	public void executar() {
		robo.escavar(colherMaterial);
	}

	@Override
	public void desfazer() {
		robo.escavar(!colherMaterial);
	}
	
}
