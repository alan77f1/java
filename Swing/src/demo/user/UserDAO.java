package demo.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements DAO<User, String> {
	DBConnection db = new DBConnection();

	@Override
	//load all users from DB
	public List<User> getAll() {
		List<User> result = new ArrayList<User>();
		//get connection from DBConnection
		Connection con = db.getConnection();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM Users");
			//
			while (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String role = rs.getString("role");
				result.add(new User(username, password, role));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		db.closeConnection();
		return result;
	}

	@Override
	public User get(String k) {
		User result = null;
		Connection con = db.getConnection();
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("SELECT * FROM Users WHERE username='" + k + "'");
			//
			if (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String role = rs.getString("role");
				result = new User(username, password, role);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		db.closeConnection();
		return result;
	}

	@Override
	public boolean save(User t) {
		int result = -1;
		Connection con = db.getConnection();
		try {
			Statement stm = con.createStatement();
			String sql = "INSERT INTO Users (username, password, role) values ('" + t.getUsername() + "', '" + t.getPassword()
			+ "', '" + t.getRole() + "')";
			result = stm.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result > 0;
	}

	@Override
	public boolean update(User t) {
		int result = -1;
		Connection con = db.getConnection();
		try {
			Statement stm = con.createStatement();
			result = stm.executeUpdate("UPDATE Users SET password = '" + t.getPassword() + "', role='" + t.getRole()
					+ "' WHERE username='" + t.getUsername() + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result > 0;
	}

	@Override
	public boolean delete(User t) {
		int result = -1;
		Connection con = db.getConnection();
		try {
			Statement stm = con.createStatement();
			result = stm.executeUpdate("DELETE FROM Users WHERE username='" + t.getUsername() + "'");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result > 0;
	}
}
