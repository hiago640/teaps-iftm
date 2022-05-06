package command.exemplo01;

import command.exemplo01.command.EscavarCommand;
import command.exemplo01.command.MoverCommand;
import command.exemplo01.command.RotacionarCommand;
import command.exemplo01.invoker.RoboController;
import command.exemplo01.receiver.Robo;

public class Cliente {
	
	public static void main(String[] args) {
		Robo robo = new Robo();
		RoboController controller = new RoboController();
		
		MoverCommand mover = new MoverCommand(robo);
		mover.paraFrente = 40;
		controller.comandos.add(mover);
		
		RotacionarCommand rotacionar = new RotacionarCommand(robo);
		rotacionar.rotacionarParaEsquerda = 45;
		controller.comandos.add(rotacionar);
		
		EscavarCommand escavar = new EscavarCommand(robo);
		escavar.colherMaterial = true;
		controller.comandos.add(escavar);
		
		controller.executarComandos();
		controller.desfazerComandos(3);
		
	}
}
