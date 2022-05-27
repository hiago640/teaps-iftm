package template.exemplo01.concrete_template;

import java.util.ArrayList;

import template.exemplo01.abstract_template.OrdenadorTemplate;

public class Playlist {

	protected ArrayList<MusicaMP3> musicas;
	protected OrdenadorTemplate ordenador;

	public Playlist(ModoDeReproducao modo) {
		musicas = new ArrayList<>();
		switch (modo) {
		case ANO: {
			ordenador = new OrdenadorPorAno();
			break;
		}
		case AUTOR: {
			ordenador = new OrdenadorPorAutor();
			break;
		}
		case ESTRELA: {
			ordenador = new OrdenadorPorEstrela();
			break;
		}
		case NOME: {
			ordenador = new OrdenadorPorNome();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + modo);
		}
	}

	public void setModoDeReproducao(ModoDeReproducao modo) {
		ordenador = null;
		switch (modo) {
		case ANO: {
			ordenador = new OrdenadorPorAno();
			break;
		}
		case AUTOR: {
			ordenador = new OrdenadorPorAutor();
			break;
		}
		case ESTRELA: {
			ordenador = new OrdenadorPorEstrela();
			break;
		}
		case NOME: {
			ordenador = new OrdenadorPorNome();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + modo);
		}
	}

	public void adicionarMusica(String nome, String autor, String ano, int estrela) {
		musicas.add(new MusicaMP3(nome, autor, ano, estrela));
	}

	public void mostrarListaDeReproducao() {
		ArrayList<MusicaMP3> newList = new ArrayList<>();
		newList = ordenador.ordenarMusica(musicas);

		String msg;
		for (MusicaMP3 musica : newList) {
			msg = String.format("%s - %s %nAno: %s - Estrelas %s", musica.nome, musica.autor, musica.ano, musica.estrelas);
			System.out.println(msg);
		}

	}
}
