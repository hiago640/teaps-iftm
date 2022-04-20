package decorator.exemplo03.product;

import java.util.ArrayList;
import java.util.List;

public class PlanoDeAcao {
	public int ano;
	public List<Acao> acoes = new ArrayList<>();

	public PlanoDeAcao(int ano) {
		this.ano = ano;
	}
	
	public void addAcao(Acao acao) {
		this.acoes.add(acao);
	}
}


