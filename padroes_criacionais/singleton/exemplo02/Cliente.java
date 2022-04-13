package singleton.exemplo02;

import singleton.exemplo02.singleton.DataBase;

public class Cliente {
	
	public static void main(String[] args) {
		DataBase conexaoDataBase = DataBase.getInstance();
		DataBase novaConexaoDataBase = DataBase.getInstance();
	}
}
