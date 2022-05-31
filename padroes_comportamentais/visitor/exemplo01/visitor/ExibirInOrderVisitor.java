package visitor.exemplo01.visitor;

import visitor.exemplo01.element.No;

public class ExibirInOrderVisitor implements ArvoreVisitor {

	@Override
	public void visitar(No no) {
		if(no == null)
			return;
		
		this.visitar(no.getEsquerdo());
		System.out.println(no.getChave());
		this.visitar(no.getDireito());
	}

}
