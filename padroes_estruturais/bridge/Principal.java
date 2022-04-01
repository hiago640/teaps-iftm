package bridge;

import bridge.abstracao_refrigerante.CocaCola;
import bridge.abstracao_refrigerante.Fanta;
import bridge.abstracao_refrigerante.Guarana;
import bridge.abstracao_tamanho.TamanhoGigante;
import bridge.abstracao_tamanho.TamanhoMedio;
import bridge.abstracao_tamanho.TamanhoPequeno;

public class Principal {
	
	public static void main(String[] args) {
		TamanhoMedio guaranaTamanhoMedio = new TamanhoMedio(new Guarana());
		guaranaTamanhoMedio.beber();
		
		TamanhoPequeno cocaTamanhoPequeno = new TamanhoPequeno(new CocaCola());
		cocaTamanhoPequeno.beber();
		
		TamanhoGigante cocaTamanhoGigante = new TamanhoGigante(new CocaCola());
		cocaTamanhoGigante.beber();
		
		TamanhoGigante fantaTamanhoGigante = new TamanhoGigante(new Fanta());
		fantaTamanhoGigante.beber();
	}
}
