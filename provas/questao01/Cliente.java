package provas.questao01;

import provas.questao01.component.RHComponent;
import provas.questao01.composite.GrupoComposite;
import provas.questao01.leaf.Docente;
import provas.questao01.leaf.TAE;
import provas.questao01.leaf.TipoGrupoEnum;

public class Cliente {
	
	public static void main(String[] args) {
		RHComponent docente1 = new Docente("Hiago");
		RHComponent docente2 = new Docente("Gabriel");
		RHComponent professor = new TAE("Lídia");
		RHComponent pesquisa1 = new GrupoComposite("Ernani", TipoGrupoEnum.PESQUISA);
		
		RHComponent docente1Time = new Docente("Adriele");
		RHComponent docente2Time = new Docente("Paulo");
		RHComponent time1 = new GrupoComposite("Barreiro", TipoGrupoEnum.TIME);
		
		RHComponent docente1Grupo = new Docente("Jacques");
		RHComponent professor2 = new TAE("Camilo");
		RHComponent grupo1 = new GrupoComposite("Jefferson", TipoGrupoEnum.COMISSAO);
		
		try {
			pesquisa1.adicionarElemento(docente1);
			pesquisa1.adicionarElemento(docente2);
			pesquisa1.adicionarElemento(professor);
			//pesquisa1.adicionarElemento(time1);
			
			pesquisa1.imprimirNomes();
			pesquisa1.enviarEmail();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			time1.adicionarElemento(docente1Time);
			time1.adicionarElemento(docente2Time);
			
			grupo1.adicionarElemento(docente1Grupo);
			time1.adicionarElemento(grupo1);
			time1.adicionarElemento(grupo1);
			time1.adicionarElemento(professor2);
			
			time1.imprimirNomes();
			time1.enviarEmail();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
