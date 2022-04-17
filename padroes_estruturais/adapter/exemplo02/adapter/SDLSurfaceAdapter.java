package adapter.exemplo02.adapter;

import adapter.exemplo02.client_interface.ImagemTarget;
import adapter.exemplo02.service.SDLSurface;

public class SDLSurfaceAdapter extends SDLSurface implements ImagemTarget {

	@Override
	public void carregarImagem(String nomeDoArquivo) {
		SDLCarregarSurface(nomeDoArquivo);
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		SDLDesenharSurface(largura, altura, posX, posY);
	}

}
