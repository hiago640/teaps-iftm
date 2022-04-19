package questao01.composite;

import java.util.ArrayList;
import java.util.List;

import questao01.component.RHComponent;
import questao01.leaf.Docente;
import questao01.leaf.TAE;
import questao01.leaf.TipoGrupoEnum;

public class GrupoComposite extends RHComponent{

	public List<RHComponent> componentes = new ArrayList<>();
	
	public GrupoComposite(String nomeDoLider, TipoGrupoEnum tipoGrupo) {
		this.nomeDoLider = nomeDoLider;
		this.tipoGrupo = tipoGrupo;
	}
	
	@Override
	public void adicionarElemento(RHComponent component) throws Exception{
		
		if(TipoGrupoEnum.PESQUISA == this.tipoGrupo) {
			if(component.getClass() != Docente.class && component.getClass() != TAE.class )
				throw new Exception("O tipo de grupo Pesquisa, só aceita Docentes e TAE's");
		
		}
			
		this.componentes.add(component);
	}

	@Override
	public void removerElemento(String nomeComponent) throws Exception {
		for (RHComponent componente : componentes) {
			if (componente.nomeDoComponente == nomeComponent) {
				this.componentes.remove(componente);
				return;
			}
		}
		throw new Exception("Não existe este componente");
		
	}

	@Override
	public RHComponent getElemento(String nomeComponent)  throws Exception{
		for(RHComponent componente : componentes) {
			if(componente.nomeDoComponente == nomeComponent)
				return componente;
		}
		throw new Exception("Não existe este componente");
	}

	@Override
	public void imprimirNomes() {
		System.out.println("\n\nNome do líder: " + nomeDoLider);
		System.out.println("Tipo do Grupo: " + tipoGrupo);
		
		for (RHComponent componente : componentes) {
			componente.imprimirNomes();
		}
		
	}


}
