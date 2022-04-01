package composite;

import java.util.ArrayList;
import java.util.List;

public class Linha {
	private List<Celula> celulas = new ArrayList<Celula>();

	public void imprimir() {
		System.out.println(" |");
		int tamanho = (celulas.size() * 17) + 5;
		char[] linha = new char[tamanho];

		for (int i = 0; i < tamanho; i++)
			linha[i] = '-';

	}

	public void adicionar(Celula c) {
		celulas.add(c);
	}
}
