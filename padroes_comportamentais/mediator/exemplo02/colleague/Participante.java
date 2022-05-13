package mediator.exemplo02.colleague;

import mediator.exemplo02.mediator.Mediator;

public abstract class Participante {
	protected Mediator mediator;

	public Participante(Mediator mediator) {
		this.mediator = mediator;
	}

	public void enviarMensagem(String msg) {
		mediator.enviar(msg, this);
	}

	public abstract void receberMensagem(String msg);
	
}
