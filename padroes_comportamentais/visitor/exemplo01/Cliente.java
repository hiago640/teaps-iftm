package visitor.exemplo01;

import visitor.exemplo01.element.ArvoreBinaria;
import visitor.exemplo01.visitor.ExibirInOrderVisitor;
import visitor.exemplo01.visitor.ExibirIndentadoVisitor;

public class Cliente {
	
	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria(7);
		
		arvore.inserir(15);
		arvore.inserir(10);
		arvore.inserir(5);
		arvore.inserir(2);
		arvore.inserir(1);
		arvore.inserir(20);
		
		System.out.println("### Exibindo em ordem");
		arvore.aceitarVisitante(new ExibirInOrderVisitor());
		System.out.println("### Exibindo identado");
		arvore.aceitarVisitante(new ExibirIndentadoVisitor());
	}
}
