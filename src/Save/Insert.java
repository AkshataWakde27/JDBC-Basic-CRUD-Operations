package Save;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/javabatch";
		String username = "root";
		String password = "root";

		// CREATING CONNECTION TYPE OBJECT
		Connection connection = null;

		try {
			// load/Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish the connection
//	    Connection connection =DriverManager.getConnection(url,username,password);
			connection = DriverManager.getConnection(url, username, password);

			// create the statement
			Statement statement = connection.createStatement();

			// execute the statement
			// Insert Operation
			statement.execute("INSERT INTO student VALUES(8,'MNO','mno@gmail.com')");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generate catch block
			e.printStackTrace();
		}

		catch (SQLException e) {
			// TODO Auto-generate catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
				System.out.println("All good");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
