package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestAccess {
	public static void main(String[] args) {

		String databaseURL = "jdbc:ucanaccess://db//contacts.accdb";

		try (Connection connection = DriverManager.getConnection(databaseURL)) {

			String sql = "INSERT INTO Contacts (FullName, Email, Phone) VALUES (?, ?, ?)";

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "Jim Rohn");
			preparedStatement.setString(2, "rohnj@herbalife.com");
			preparedStatement.setString(3, "0919989998");

			int row = preparedStatement.executeUpdate();

			if (row > 0) {
				System.out.println("A row has been inserted successfully.");
			}

			sql = "SELECT * FROM Contacts";

			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				int id = result.getInt("ID");
				String fullname = result.getString("FullName");
				String email = result.getString("Email");
				String phone = result.getString("Phone");

				System.out.println(id + ", " + fullname + ", " + email + ", " + phone);
			}
			connection.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
}
