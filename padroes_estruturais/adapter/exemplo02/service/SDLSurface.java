package adapter.exemplo02.service;

public class SDLSurface {
	public void SDLCarregarSurface(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
	}

	public void SDLDesenharSurface(int largura, int altura, int posicaoX, int posicaoY) {
		System.out.println("SDL_Surface Image desenhada");
	}
}
