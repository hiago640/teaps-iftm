package template.exemplo01.concrete_template;

import template.exemplo01.abstract_template.OrdenadorTemplate;

public class OrdenadorPorEstrela extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
		if (musica1.estrelas > musica2.estrelas)
			return true;

		return false;
	}

}
