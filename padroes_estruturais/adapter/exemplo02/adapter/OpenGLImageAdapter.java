package adapter.exemplo02.adapter;

import adapter.exemplo02.client_interface.ImagemTarget;
import adapter.exemplo02.service.OpenGLImage;

public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget{
	@Override
	public void carregarImagem(String nomeDoArquivo) {
		glCarregarImagem(nomeDoArquivo);		
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		glDesenharImagem(posX, posY);	
	}

}
