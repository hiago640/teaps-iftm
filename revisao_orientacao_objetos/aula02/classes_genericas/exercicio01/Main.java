package aula02.classes_genericas.exercicio01;

public class Main extends Par {
	
	public static void main(String[] args) {
		Par <Integer, String> par = new Par();
		par.setFirst(1);
		par.setSecond("sdsas");
		System.out.println(par.exibirPar());
	}	
}
