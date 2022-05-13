package mediator.exemplo02.mediator;

import mediator.exemplo02.colleague.Participante;

public interface Mediator {
	
	public void enviar(String mensagem, Participante participante);
}
