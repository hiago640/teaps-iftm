package mediator.exemplo01;

import mediator.exemplo01.colleague.AndroidColleague;
import mediator.exemplo01.colleague.Colleague;
import mediator.exemplo01.colleague.IOSColleague;
import mediator.exemplo01.colleague.SymbianColleague;
import mediator.exemplo01.mediator.MensagemMediator;

public class Cliente {
	
	public static void main(String[] args) {
		MensagemMediator mediator = new MensagemMediator();
		
		Colleague android = new AndroidColleague(mediator);
		Colleague ios = new IOSColleague(mediator);
		Colleague symbian = new SymbianColleague(mediator);
		
		mediator.adicionarColleague(ios);
		mediator.adicionarColleague(android);
		mediator.adicionarColleague(symbian);
		
		symbian.enviarMensagem("Oi, eu sou Symbian!");
		System.out.println("================");
		android.enviarMensagem("Oi, Symbian eu sou o Android!");
		System.out.println("================");
		ios.enviarMensagem("Olá todos, eu sou um IOS");
	}
	
}
