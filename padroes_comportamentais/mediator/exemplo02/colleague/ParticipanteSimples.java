package mediator.exemplo02.colleague;

import mediator.exemplo02.mediator.Mediator;

public class ParticipanteSimples extends Participante {

	public ParticipanteSimples(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receberMensagem(String msg) {
		System.out.println("ParticipanteSimples recebeu " + msg);
	}

}
