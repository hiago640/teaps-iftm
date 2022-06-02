package template.exemplo02.concrete_template;

import template.exemplo02.abstract_template.TransformadorTemplate;

public class GerenciadorSistema {

	protected String frase;
	protected TransformadorTemplate transformador;

	public GerenciadorSistema(ModoDeTransformacao modo, String frase) {
		this.frase = frase;
		
		switch (modo) {
		case MAIUSCULO: {
			transformador = new TransformadorMaiusculo();
			break;
		}
		case MINUSCULO: {
			transformador = new TransformadorMinusculo();
			break;
		}
		case DUPLICAR: {
			transformador = new TransformadorDuplicar();
			break;
		}
		case INVERTER: {
			transformador = new TransformadorInverter();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + modo);
		}
	}
	
	public void setModoDeTransformacao(ModoDeTransformacao modo) {
		transformador = null;
		switch (modo) {
		case MAIUSCULO: {
			transformador = new TransformadorMaiusculo();
			break;
		}
		case MINUSCULO: {
			transformador = new TransformadorMinusculo();
			break;
		}
		case DUPLICAR: {
			transformador = new TransformadorDuplicar();
			break;
		}
		case INVERTER: {
			transformador = new TransformadorInverter();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + modo);
		}
	}
	
	public void getFraseTransformada() {
		System.out.println(transformador.transformar(frase));
	}

}
