package Singleton;

public class Main {
	public static void main(String[] args) {

		DatabaseConnection dbConnection = DatabaseConnection.getInstance();

		dbConnection.executeQuery("SELECT * FROM usuarios");
		dbConnection.closeConnection();

	}
}
