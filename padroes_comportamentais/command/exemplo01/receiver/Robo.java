package command.exemplo01.receiver;

public class Robo {
	
	public void mover(int distancia) {
		if(distancia > 0)
			System.out.println("O robo foi movimentado para frente " + distancia + " mm");
		else
			System.out.println("O robo foi movimentado para trás " + distancia + " mm");
	}
	
	public void rotacionarParaEsquerda(double graus) {
		if(graus > 0)
			System.out.println("O robo foi rotacionado para esquerda " + graus);
		else
			System.out.println("O robo foi rotacionado para direita " + graus);
	}
	
	public void escavar(boolean paraCima) {
		if(paraCima)
			System.out.println("O robo recolheu o material");
		else
			System.out.println("O robo despejou o material");
	}
}
