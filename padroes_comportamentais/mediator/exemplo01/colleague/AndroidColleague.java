package mediator.exemplo01.colleague;

import mediator.exemplo01.mediator.Mediator;

public class AndroidColleague extends Colleague {

	public AndroidColleague(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void receberMensagem(String msg) {
		System.out.println("Android recebeu " + msg);
	}

}
