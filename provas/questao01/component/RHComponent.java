package questao01.component;

import questao01.leaf.TipoGrupoEnum;

public abstract class RHComponent {
	public String nomeDoLider;
	public TipoGrupoEnum tipoGrupo;
	public String nomeDoComponente;
	
	public void enviarEmail() {
		System.out.println("\n\n>>>>>Enviando email ao lider :" + this.nomeDoLider);
	}
	
	public void adicionarElemento(RHComponent component) throws Exception{
		throw new Exception("Não pode inserir componente em: " + this.nomeDoComponente + " - Não é um grupo");
	}
	
	public void removerElemento(String nomeComponent) throws Exception{
		throw new Exception("Não pode remover componente em: " + this.nomeDoComponente + " - Não é um grupo");
	}
	
	public RHComponent getElemento(String nomeComponent) throws Exception{
		throw new Exception("Não pode pesquisar componente em: " + this.nomeDoComponente + " - Não é um grupo");
	}
	
	public void imprimirNomes() {
		System.out.print(" - " + this.nomeDoComponente);
	}
}
