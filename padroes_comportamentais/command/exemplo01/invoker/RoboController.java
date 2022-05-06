package command.exemplo01.invoker;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import command.exemplo01.command.RoboCommand;

public class RoboController {
	
	public List<RoboCommand> comandos;
	public Stack<RoboCommand> desfazerPilha;
	
	public RoboController() {
		comandos = new ArrayList<>();
		desfazerPilha = new Stack<>();
	}
	
	public void executarComandos() {
		System.out.println("Executando Comando(s)");
		
		while(comandos.size() > 0) {
			RoboCommand command = comandos.remove(0);
			command.executar();
			desfazerPilha.push(command);
		}
	}
	
	public void desfazerComandos(int qtd) {
		System.out.println("Desfazendo " + qtd + " comandos");
	
		while(qtd > 0 && desfazerPilha.size() > 0) {
			RoboCommand command = desfazerPilha.pop();
			command.desfazer();
			qtd--;
		}
	}
}
