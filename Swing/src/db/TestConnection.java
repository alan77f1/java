package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		Class.forName("org.hsqldb.jdbcDriver");
		Class.forName("org.postgresql.Driver");// jdbc postgres .jar
		String dburl = "jdbc:postgresql://localhost:5432/demo";
		Connection c = DriverManager.getConnection(dburl, "postgres", "admin");
//		Connection c = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/", "SA", "");

		Statement stm = c.createStatement();
		ResultSet rs = stm.executeQuery("SELECT * FROM \"STUDENT\"");

		while (rs.next()) {
			String id = rs.getString(1);
			String name = rs.getString(2);
			System.out.println(id + " " + name);
		}
		System.out.println("Done");
	}
}