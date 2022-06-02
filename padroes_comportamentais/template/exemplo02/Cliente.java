package template.exemplo02;

import template.exemplo02.concrete_template.GerenciadorSistema;
import template.exemplo02.concrete_template.ModoDeTransformacao;

public class Cliente {

	public static void main(String[] args) {
		
		GerenciadorSistema sistema = new GerenciadorSistema(ModoDeTransformacao.MAIUSCULO, "exemPLO De fraSE");
		sistema.getFraseTransformada();
		
		sistema.setModoDeTransformacao(ModoDeTransformacao.MINUSCULO);
		sistema.getFraseTransformada();
		
		sistema.setModoDeTransformacao(ModoDeTransformacao.INVERTER);
		sistema.getFraseTransformada();
		
		sistema.setModoDeTransformacao(ModoDeTransformacao.DUPLICAR);
		sistema.getFraseTransformada();
	}
	
}
