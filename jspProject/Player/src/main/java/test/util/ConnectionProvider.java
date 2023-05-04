package test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import test.util.ConnectionProvider;

public class ConnectionProvider {
	
	public static Connection getConnection() throws SQLException {
		
		String dbUrl = "jdbc:mysql://localhost:3306/project";
		return DriverManager.getConnection(dbUrl, "himedia", "as8744034!");
		
	}
	public static void main(String[] args) throws SQLException {
		System.out.println(ConnectionProvider.getConnection());
	}

}
