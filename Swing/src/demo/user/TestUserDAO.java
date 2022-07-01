package demo.user;

public class TestUserDAO {
	public static void main(String[] args) {
		UserDAO dao = new UserDAO();
		User u1 = new User("admin", "123456", "admin");
		User u2 = new User("user", "123456", "user");
		User u3 = new User("guest", "123456", "guest");
//		dao.save(u1);
//		dao.save(u2);
//		dao.save(u3);
//		System.out.println(dao.getAll());
//		u1.setPassword("adminadmin");
//		System.out.println(dao.update(u1));
	}

}
