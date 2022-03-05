package aula02.exercicio02;

public class Main extends Dicionario{
	public static void main(String[] args) {
		Dicionario<Integer, String> dic = new Dicionario<>();
		dic.add(1, "Nafuzi");
		dic.add(2, "Hiagod");
		System.out.println(dic.getDicionario(1));
	}
}
