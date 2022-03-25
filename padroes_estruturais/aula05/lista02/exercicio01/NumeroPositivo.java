package aula05.lista02.exercicio01;

import java.util.Random;

public class NumeroPositivo extends Numero{

	@Override
	public void geraNumero() {
		Random random = new Random();
		this.numero = random.nextInt(30);
	}
	
}
