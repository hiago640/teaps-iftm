package bridge.exemplo01;

import bridge.exemplo01.abstraction.TamanhoGigante;
import bridge.exemplo01.abstraction.TamanhoMedio;
import bridge.exemplo01.abstraction.TamanhoPequeno;
import bridge.exemplo01.implementation.CocaCola;
import bridge.exemplo01.implementation.Fanta;
import bridge.exemplo01.implementation.Guarana;

public class Cliente {
	
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
