package questao02.decorators;

import questao02.product.Tarefa;

public class Reuniao extends TarefaDecorator{

	Tarefa tarefa;
	String novaDescr;
	
	public Reuniao(String informacao, String local, String tipo, String registroDeAta, Tarefa tarefa) {
		this.tarefa = tarefa;
		novaDescr = String.format("[Reunião %s, realizada no local %s, sendo %s, com a ata %s] ",informacao, local, tipo, registroDeAta);
	}
	
	@Override
	public String getDescricao() {
		return tarefa.getDescricao() + novaDescr;
	}
}
