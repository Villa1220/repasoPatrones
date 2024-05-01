package Singleton;

public class DatabaseConnection {
	private static DatabaseConnection instance;

	private DatabaseConnection() {
	}

	public static synchronized DatabaseConnection getInstance() {

		if (instance == null) {
			instance = new DatabaseConnection();
		}
		return instance;
	}

	public void executeQuery(String query) {
		System.out.println("Ejecutando consulta: " + query);
	}

	public void closeConnection() {
		System.out.println("Conexión a la base de datos cerrada.");
	}

}
