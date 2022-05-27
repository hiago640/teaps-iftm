package template.exemplo01.concrete_template;

import template.exemplo01.abstract_template.OrdenadorTemplate;

public class OrdenadorPorAutor extends OrdenadorTemplate {

	@Override
	public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
		if (musica1.autor.compareToIgnoreCase(musica2.autor) <= 0)
			return true;

		return false;
	}

}
