package mediator.exemplo01.colleague;

import mediator.exemplo01.mediator.Mediator;

public class IOSColleague extends Colleague {

	public IOSColleague(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receberMensagem(String msg) {
		System.out.println("IOs recebeu " + msg);
	}

}
