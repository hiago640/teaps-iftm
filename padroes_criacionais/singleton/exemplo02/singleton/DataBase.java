package singleton.exemplo02.singleton;

public class DataBase {

	private DataBase() {
	}

	private static DataBase uniqueInstance;

	public static synchronized DataBase getInstance() {

		if (uniqueInstance == null) {
			System.out.println("Criando uma nova instancia.");
			uniqueInstance = new DataBase();
		} else {
			System.out.println("Retornando uma instancia existente.");
		}

		return uniqueInstance;

	}
}
