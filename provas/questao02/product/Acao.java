package questao02.product;

import java.util.ArrayList;
import java.util.List;

import questao02.product.enums.TipoResponsavelEnum;

public class Acao {
	public String dtInicio;
	public String dtTermino;
	public double percConclusao;
	TipoResponsavelEnum responsavel;
	public List<Tarefa> tarefas = new ArrayList<>();
	
	public Acao(String dtInicio, String dtTermino, double percConclusao, TipoResponsavelEnum responsavel) {
		super();
		this.dtInicio = dtInicio;
		this.dtTermino = dtTermino;
		this.percConclusao = percConclusao;
		this.responsavel = responsavel;
	}
	
	public void addTarefa(Tarefa tarefa) {
		this.tarefas.add(tarefa);
	}
	
	
}
