package aula04.lista01.exercicio01;

import aula04.lista01.exercicio01.enums.PaoEnum;
import aula04.lista01.exercicio01.enums.PresuntoEnum;
import aula04.lista01.exercicio01.enums.QueijoEnum;
import aula04.lista01.exercicio01.enums.SaladaEnum;

public abstract class Sanduiche {
	String descricao;
	PaoEnum tipoPao;
	QueijoEnum tipoQueijo;
	PresuntoEnum tipoPresunto;
	SaladaEnum tipoSalada;

	public void fritar() {
		System.out.println("Tá pegando fogo bixo!");
	}
	
}
