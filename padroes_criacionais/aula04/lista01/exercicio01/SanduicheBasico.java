package aula04.lista01.exercicio01;

import aula04.lista01.exercicio01.enums.PaoEnum;
import aula04.lista01.exercicio01.enums.PresuntoEnum;
import aula04.lista01.exercicio01.enums.QueijoEnum;
import aula04.lista01.exercicio01.enums.SaladaEnum;

public class SanduicheBasico extends Sanduiche {
	
	public SanduicheBasico(PaoEnum tipoPao, QueijoEnum tipoQueijo, PresuntoEnum tipoPresunto, SaladaEnum tipoSalada) {
		this.tipoPao = tipoPao;
		this.tipoQueijo = tipoQueijo;
		this.tipoPresunto = tipoPresunto;
		this.tipoSalada = tipoSalada;
	}
	
	
}
