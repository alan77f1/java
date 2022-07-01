package demo.user;

import java.util.List;

public class StudentDAO implements DAO<Student, String> {

	@Override
	public List<Student> getAll() {
		return null;
	}

	@Override
	public Student get(String k) {
		return null;
	}

	@Override
	public boolean save(Student t) {
		return false;
	}

	@Override
	public boolean update(Student t) {
		return false;
	}

	@Override
	public boolean delete(Student t) {
		return false;
	}
}
