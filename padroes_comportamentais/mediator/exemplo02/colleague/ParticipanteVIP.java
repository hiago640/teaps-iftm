package mediator.exemplo02.colleague;

import mediator.exemplo02.mediator.Mediator;

public class ParticipanteVIP extends Participante{

	public ParticipanteVIP(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receberMensagem(String msg) {
		System.out.println("ParticipanteVIP recebeu " + msg);
	}
	
}
