package facade.exemplo01.facade;

import facade.exemplo01.subsystems.SistemaDeAudio;
import facade.exemplo01.subsystems.SistemaDeInput;
import facade.exemplo01.subsystems.SistemaDeVideo;

public class SistemasFacade {
	protected SistemaDeAudio audio;
	protected SistemaDeInput input;
	protected SistemaDeVideo video;

	public void inicializarSubsistemas() {
		video = new SistemaDeVideo();
		video.configurarCores();
		video.configurarResolucao();

		input = new SistemaDeInput();
		input.configurarJoystick();
		input.configurarTeclado();

		audio = new SistemaDeAudio();
		audio.configurarCanais();
		audio.configurarFrequencia();
		audio.configurarVolume();
	}

	public void reproduzirAudio(String arquivo) {
		audio.reproduzirAudio(arquivo);
	}

	public void renderizarImagem(String imagem) {
		video.renderizarImagem(imagem);
	}

	public void lerInput() {
		input.lerInput();
	}
}
