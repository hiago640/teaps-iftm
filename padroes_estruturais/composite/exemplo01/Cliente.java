package composite.exemplo01;

import composite.exemplo01.component.ArquivoComponent;
import composite.exemplo01.composite.ArquivoComposite;
import composite.exemplo01.leaf.ArquivoTexto;
import composite.exemplo01.leaf.ArquivoVideo;

public class Cliente {

	public static void main(String[] args) {
		ArquivoComponent minhaPasta = new ArquivoComposite("Minha Pasta/");
		ArquivoComponent meuVideo = new ArquivoVideo("meu video.avi");
		ArquivoComponent meuOutroVideo = new ArquivoVideo("serieS01E01.mkv");
		ArquivoComponent pastaDocumentos = new ArquivoComposite("Documentos/");
		ArquivoComponent meuTexto = new ArquivoTexto("TCC.pdf");
		
		try {
			meuVideo.adicionar(meuOutroVideo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			minhaPasta.adicionar(meuVideo);
			minhaPasta.adicionar(meuOutroVideo);
			
			pastaDocumentos.adicionar(meuTexto);
			minhaPasta.adicionar(pastaDocumentos);
			
			minhaPasta.printNomeDoArquivo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
