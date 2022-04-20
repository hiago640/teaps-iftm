package decorator.exemplo03.product;

import decorator.exemplo03.product.enums.TipoResponsavelEnum;

public class Tarefa {
	
	protected String descricao;
	public String dtInicio;
	public String dtTermino;
	TipoResponsavelEnum responsavel;
	public double percConclusao;

	public Tarefa() {
		
	}

	public Tarefa(String descricao, String dtInicio, String dtTermino, TipoResponsavelEnum responsavel,
			double percConclusao) {
		this.descricao = descricao;
		this.dtInicio = dtInicio;
		this.dtTermino = dtTermino;
		this.responsavel = responsavel;
		this.percConclusao = percConclusao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void informacoesAdicionais() {
		System.out.println(this.getDescricao());
	}
}
