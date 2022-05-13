package memento.exemplo01;

import memento.exemplo01.originator.Texto;

public class Cliente {
	
	public static void main(String[] args) {
		
		Texto texto = new Texto();
		
		texto.escreverTexto("PRIMEIRA LINHA\n");
		texto.escreverTexto("SEGUNDA LINHA\n");
		texto.escreverTexto("TERCEIRA LINHA\n");
		texto.mostrarTexto();

		System.out.println("Retirando a 3º linha");
		texto.desfazerEscrita();
		texto.mostrarTexto();

		System.out.println("Retirando a 2º linha");
		texto.desfazerEscrita();
		texto.mostrarTexto();
		
		System.out.println("Retirando a 1º linha");
		texto.desfazerEscrita();
		texto.mostrarTexto();

	}
	
}
