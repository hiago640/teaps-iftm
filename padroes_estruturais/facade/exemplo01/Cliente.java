package facade.exemplo01;

import facade.exemplo01.facade.SistemasFacade;

public class Cliente {
	
	public static void main(String[] args) {
		SistemasFacade facade = new SistemasFacade();
		System.out.println(">>>Configurando subsistemas");
		facade.inicializarSubsistemas();
		
		System.out.println("\n>>>Utilizando subsistemas");
		facade.renderizarImagem("imagem.png");
		facade.reproduzirAudio("teste.mp3");
		facade.lerInput();
	}
}
