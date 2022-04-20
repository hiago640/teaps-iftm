package decorator.exemplo03.decorators;

import decorator.exemplo03.product.Tarefa;
import decorator.exemplo03.product.enums.TipoMetaEnum;

public class Meta extends TarefaDecorator {

	Tarefa tarefa;
	String novaDescr;
	public Meta(String descricao, TipoMetaEnum tipoMeta, double valor, double valorObtido, Tarefa tarefa) {
		this.tarefa = tarefa;
		novaDescr = String.format("%n[Meta %s, do tipo: %s, com o valor de %s, alcançou o valor de %s] ", descricao, tipoMeta, valor,valorObtido);
	}

	@Override
	public String getDescricao() {
		return tarefa.getDescricao() + novaDescr;
	}
	
}
