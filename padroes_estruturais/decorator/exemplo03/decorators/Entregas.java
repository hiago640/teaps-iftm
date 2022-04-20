package decorator.exemplo03.decorators;

import decorator.exemplo03.product.Tarefa;

public class Entregas extends TarefaDecorator{
	
	Tarefa tarefa;
	String novaDescr;
	public Entregas(String descEntrega, String link, Tarefa tarefa) {
		this.tarefa = tarefa;
		novaDescr = String.format("%n[Entrega %s, link de entrega: %s] ", descEntrega, link);
	}
	
	@Override
	public String getDescricao() {
		return tarefa.getDescricao() +  novaDescr;
	}
}
