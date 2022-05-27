package template.exemplo01.abstract_template;

import java.util.ArrayList;

import template.exemplo01.concrete_template.MusicaMP3;

public abstract class OrdenadorTemplate {

	public abstract boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2);

	public ArrayList<MusicaMP3> ordenarMusica(ArrayList<MusicaMP3> list) {
		ArrayList<MusicaMP3> newList = new ArrayList<>();
		newList.addAll(list);

		for (int i = 0; i < newList.size(); i++) {
			for (int j = i; j < newList.size(); j++) {
				if (!isPrimeiro(newList.get(i), newList.get(j))) {
					MusicaMP3 temp = newList.get(j);
					newList.set(j, newList.get(i));
					newList.set(i, temp);
				}

			}
		}
		return newList;
	}
}
