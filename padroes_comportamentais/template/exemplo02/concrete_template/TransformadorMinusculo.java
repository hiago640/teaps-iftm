package template.exemplo02.concrete_template;

import template.exemplo02.abstract_template.TransformadorTemplate;

public class TransformadorMinusculo implements TransformadorTemplate {

	@Override
	public String transformar(String frase) {
		return frase.toLowerCase();
	}

}
