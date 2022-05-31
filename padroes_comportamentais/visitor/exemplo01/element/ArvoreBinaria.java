package visitor.exemplo01.element;

import visitor.exemplo01.visitor.ArvoreVisitor;

public class ArvoreBinaria {
	
	No raiz;
	int quantidadeDeElementos;
	
	public ArvoreBinaria(int chaveRaiz) {
		raiz = new No(chaveRaiz);
		quantidadeDeElementos = 0;
	}

	public void inserir(int chave) {
		
		if(chave < raiz.getChave()) {
			if(raiz.getEsquerdo() == null)
				raiz.setEsquerdo(new No(chave));
			else {
				inserir(raiz.getEsquerdo(), chave);
			}
		} else {
			if(raiz.getDireito() == null)
				raiz.setDireito(new No(chave));
			else {
				inserir(raiz.getDireito(), chave);
			}
		}
		
	}
	
	public void inserir(No no, int chave) {
		
		if(chave < no.getChave()) {
			if(no.getEsquerdo() == null)
				no.setEsquerdo(new No(chave));
			else {
				inserir(no.getEsquerdo(), chave);
			}
		} else {
			if(no.getDireito() == null)
				no.setDireito(new No(chave));
			else {
				inserir(no.getDireito(), chave);
			}
		}
		
	}
	
	public void remover(int chave) {
		
	}
	
	public void buscar(int chave) {
		
	}
	
	public void aceitarVisitante(ArvoreVisitor visitor) {
		visitor.visitar(raiz);
	}
}
