package template.exemplo01.concrete_template;

import template.exemplo01.abstract_template.OrdenadorTemplate;

public class OrdenadorPorAno extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
		if (musica1.ano.compareTo(musica2.ano) <= 0)
			return true;

		return false;
	}

}
