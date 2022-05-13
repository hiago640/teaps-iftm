package mediator.exemplo02;

import mediator.exemplo02.colleague.Participante;
import mediator.exemplo02.colleague.ParticipanteSimples;
import mediator.exemplo02.colleague.ParticipanteVIP;
import mediator.exemplo02.mediator.ChatRoom;

public class Cliente {

	public static void main(String[] args) {
		ChatRoom chatMediator = new ChatRoom();
		
		Participante participanteSimples = new ParticipanteSimples(chatMediator);
		Participante participanteVip = new ParticipanteVIP(chatMediator);
		
		chatMediator.adicionarColleague(participanteVip);
		chatMediator.adicionarColleague(participanteSimples);
		
		participanteSimples.enviarMensagem("Oi, eu sou um participante Simples!");
		System.out.println("================");
		participanteVip.enviarMensagem("Oi eu sou um participante Vip");
	}
	
}
