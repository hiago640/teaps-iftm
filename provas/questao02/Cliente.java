package questao02;

import questao02.decorators.Entregas;
import questao02.decorators.Meta;
import questao02.decorators.Reuniao;
import questao02.product.Acao;
import questao02.product.PlanoDeAcao;
import questao02.product.Tarefa;
import questao02.product.enums.TipoMetaEnum;
import questao02.product.enums.TipoResponsavelEnum;

public class Cliente {
	
	public static void main(String[] args) {
		PlanoDeAcao planoDeAcao = new PlanoDeAcao(2022);
		
		Acao acao1 = new Acao("18/04/2022", "19/04/2022", 100, TipoResponsavelEnum.DOCENTE);
		
		Tarefa tarefa = new Tarefa("Terminar a prova", "18/04/2022", "18/04/2022",TipoResponsavelEnum.DOCENTE ,75);
		tarefa = new Entregas("Entregar questão 1", "ava.upt.iftm.edu.br", tarefa);
		tarefa = new Entregas("Entregar questão 2", "ava.upt.iftm.edu.br", tarefa);
		tarefa = new Meta("Atingir 100%", TipoMetaEnum.DESEMPENHO, 100, 100, tarefa);
		tarefa.informacoesAdicionais();
		acao1.addTarefa(tarefa);
		
		System.out.println("\n\n");
		Tarefa tarefa2 = new Tarefa("Lavar a louça", "19/04/2022", "20/04/2022", TipoResponsavelEnum.TAE, 0);
		tarefa2 = new Reuniao("Reunião para dobrar a meta", "Meet", "Online" , "n sei o que é ata", tarefa2);
		tarefa2.informacoesAdicionais();
		acao1.addTarefa(tarefa2);
		
		planoDeAcao.addAcao(acao1);
		
	}
	
}
