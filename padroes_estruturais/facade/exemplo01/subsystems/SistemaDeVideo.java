package facade.exemplo01.subsystems;

public class SistemaDeVideo {

	public void configurarCores() {
		System.out.println("Configurando Cores");
	}

	public void configurarResolucao() {
		System.out.println("Configurando Resolucao");
	}

	public void renderizarImagem(String imagem) {
		System.out.println("Renderizando imagem: " + imagem);
	}

}
