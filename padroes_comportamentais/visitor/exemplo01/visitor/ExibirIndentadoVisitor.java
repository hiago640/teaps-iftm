package visitor.exemplo01.visitor;

import visitor.exemplo01.element.No;

public class ExibirIndentadoVisitor implements ArvoreVisitor {

	@Override
	public void visitar(No no) {
		if(no == null)
			return;
		
		System.out.println(no.getChave());
		visitar(no.getEsquerdo(), 1);
		visitar(no.getDireito(), 1);
	}

	private void visitar(No no, int qtdEspacos) {
		if(no == null)
			return;
		
		for(int i = 0; i<qtdEspacos; i++)
			System.out.print("-");
		
		System.out.println(no.getChave());
		visitar(no.getEsquerdo(), qtdEspacos++);
		visitar(no.getDireito(), qtdEspacos++);
		
	}
}
