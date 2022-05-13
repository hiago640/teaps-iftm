package mediator.exemplo01.colleague;

import mediator.exemplo01.mediator.Mediator;

public class SymbianColleague extends Colleague {

	public SymbianColleague(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receberMensagem(String msg) {
		System.out.println("Symbian recebeu " + msg);
	}

}
