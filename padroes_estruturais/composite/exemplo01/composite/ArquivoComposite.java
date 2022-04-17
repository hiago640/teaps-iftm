package composite.exemplo01.composite;

import java.util.ArrayList;
import java.util.List;

import composite.exemplo01.component.ArquivoComponent;

public class ArquivoComposite extends ArquivoComponent {

	public List<ArquivoComponent> arquivos = new ArrayList<>();

	public ArquivoComposite(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}

	@Override
	public void printNomeDoArquivo() {
		System.out.println(this.nomeDoArquivo);
		
		for (ArquivoComponent arquivo : arquivos) {
			
			if(arquivo.getClass() == this.getClass())
				System.out.println(" ");
			
			arquivo.printNomeDoArquivo();
		}
	}

	@Override
	public void adicionar(ArquivoComponent novoArquivo) throws Exception {
		this.arquivos.add(novoArquivo);
	}

	@Override
	public void remover(String nomeDoArquivo) throws Exception {
		for (ArquivoComponent arquivo : arquivos) {
			if (arquivo.getNomeDoArquivo() == nomeDoArquivo) {
				this.arquivos.remove(arquivo);
				return;
			}
		}
		throw new Exception("Não existe este arquivo");
	}
	
	@Override
	public ArquivoComponent getArquivo(String nomeDoArquivo) throws Exception {
		for(ArquivoComponent arquivo : arquivos) {
			if(arquivo.getNomeDoArquivo() == nomeDoArquivo)
				return arquivo;
		}
		throw new Exception("Não existe este arquivo");
	}

}
