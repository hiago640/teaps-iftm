package template.exemplo01;

import template.exemplo01.concrete_template.ModoDeReproducao;
import template.exemplo01.concrete_template.Playlist;

public class Cliente {
	
	public static void main(String[] args) {
		Playlist minhaPlaylist = new Playlist(ModoDeReproducao.NOME);
		minhaPlaylist.adicionarMusica("Everlong", "Foo Fighters", "1997", 5);
		minhaPlaylist.adicionarMusica("American Jesus", "Bad Religion", "1993", 3);
		minhaPlaylist.adicionarMusica("Song 2", "Blur", "1997", 4);
		minhaPlaylist.adicionarMusica("No Cigar", "Milencollin", "2001", 2);
		minhaPlaylist.adicionarMusica("Ten", "Pearl Jam", "1991", 1);
		
		System.out.println("\n=== Lista por nome da musica ===");
		minhaPlaylist.mostrarListaDeReproducao();
		
		System.out.println("\n=== Lista por Autor ===");
		minhaPlaylist.setModoDeReproducao(ModoDeReproducao.AUTOR);
		minhaPlaylist.mostrarListaDeReproducao();
	
		System.out.println("\n=== Lista por Ano ===");
		minhaPlaylist.setModoDeReproducao(ModoDeReproducao.ANO);
		minhaPlaylist.mostrarListaDeReproducao();
		
		System.out.println("\n=== Lista por Estrela ===");
		minhaPlaylist.setModoDeReproducao(ModoDeReproducao.ESTRELA);
		minhaPlaylist.mostrarListaDeReproducao();
	}
	
}
