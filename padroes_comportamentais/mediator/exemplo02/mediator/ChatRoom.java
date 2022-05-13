package mediator.exemplo02.mediator;

import java.util.ArrayList;
import java.util.List;

import mediator.exemplo02.colleague.Participante;
import mediator.exemplo02.colleague.ParticipanteSimples;

public class ChatRoom implements Mediator {

	protected List<Participante> participantes = new ArrayList<>();

	public void adicionarColleague(Participante participante) {
		participantes.add(participante);
	}

	@Override
	public void enviar(String mensagem, Participante participante) {
		for (Participante parti : participantes) {
			if (parti != participante) {
				verificarParticipante(parti);
				parti.receberMensagem(mensagem);
			}
		}
	}

	private void verificarParticipante(Participante participante) {

		if (participante instanceof ParticipanteSimples) {
			System.out.println("Você pode enviar somente duas mensagens a cada 30 minutos\n");
		} else {
			System.out.println("Você pode enviar mensagens ilimitadas\n");
		}
	}
}
