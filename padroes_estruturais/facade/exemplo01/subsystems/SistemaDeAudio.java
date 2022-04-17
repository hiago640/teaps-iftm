package facade.exemplo01.subsystems;

public class SistemaDeAudio {

	public void configurarCanais() {
		System.out.println("Configurando Canais");
	}

	public void configurarFrequencia() {
		System.out.println("Configurando Frequencia");
	}

	public void configurarVolume() {
		System.out.println("Configurando Volume");
	}

	public void reproduzirAudio(String arquivo) {
		System.out.println("Reproduzindo audio: " + arquivo);
			
	}

}
