package adapter.exemplo02;

import adapter.exemplo02.adapter.OpenGLImageAdapter;
import adapter.exemplo02.adapter.SDLSurfaceAdapter;
import adapter.exemplo02.client_interface.ImagemTarget;

public class Cliente {
	
	public static void main(String[] args) {
		
		System.out.println("Com SDLSurface >>>>>>");
		ImagemTarget imagem = new SDLSurfaceAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);
		
		System.out.println("\nCom OpenGL >>>>>>");
		imagem = new OpenGLImageAdapter();
		imagem.carregarImagem("teste.png");
		imagem.desenharImagem(0, 0, 10, 10);
	}
}
