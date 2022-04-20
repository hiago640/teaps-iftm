package decorator.exemplo03.decorators;

import decorator.exemplo03.product.Tarefa;

public abstract class TarefaDecorator extends Tarefa{
	
	public String getDescricao() {
		return descricao;
	};

}
