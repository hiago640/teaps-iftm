package mediator.exemplo01.mediator;

import mediator.exemplo01.colleague.Colleague;

public interface Mediator {
	
	void enviar(String mensagem, Colleague colleague);
}
