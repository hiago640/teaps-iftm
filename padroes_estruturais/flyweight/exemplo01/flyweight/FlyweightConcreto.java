package flyweight.exemplo01.flyweight;

import flyweight.exemplo01.object.Imagem;
import flyweight.exemplo01.object.Ponto;

public class FlyweightConcreto extends Flyweight {

	public Imagem imagem;

	public FlyweightConcreto(String nomeDaImagem) {
		imagem = new Imagem(nomeDaImagem);
	}

	@Override
	public void desenharImagem(Ponto ponto) {
		imagem.desenharImagem();
		System.out.println("No ponto (" + ponto.x + "," + ponto.y + ")!");
	}

}
