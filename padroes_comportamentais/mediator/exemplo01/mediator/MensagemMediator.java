package mediator.exemplo01.mediator;

import java.util.ArrayList;
import java.util.List;

import mediator.exemplo01.colleague.AndroidColleague;
import mediator.exemplo01.colleague.Colleague;
import mediator.exemplo01.colleague.IOSColleague;
import mediator.exemplo01.colleague.SymbianColleague;

public class MensagemMediator implements Mediator {

	protected List<Colleague> contatos = new ArrayList<>();
	
	public void adicionarColleague(Colleague colleague) {
		contatos.add(colleague);
	}
	
	@Override
	public void enviar(String mensagem, Colleague colleague) {
		for(Colleague contato : contatos) {
			if(contato != colleague) {
				definirProtocolo(contato);
				contato.receberMensagem(mensagem);
			}
		}
	}
	
	private void definirProtocolo(Colleague contato) {
		
		if(contato instanceof IOSColleague)
			System.out.println("Protocolo IOs");
		else if (contato instanceof AndroidColleague)
			System.out.println("Protocolo Android");
		else if (contato instanceof SymbianColleague)
			System.out.println("Protocolo Symbian");
	}
	

}
