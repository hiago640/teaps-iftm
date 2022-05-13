package mediator.exemplo01.colleague;

import mediator.exemplo01.mediator.Mediator;

public abstract class Colleague {

	protected Mediator mediator;
	
	public Colleague(Mediator mediator) {
		this.mediator = mediator;
	}
	
	public void enviarMensagem(String msg) {
		mediator.enviar(msg, this);
	}
	
	public abstract void receberMensagem(String msg);
}
