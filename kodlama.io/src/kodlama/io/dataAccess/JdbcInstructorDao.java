package kodlama.io.dataAccess;

import kodlama.io.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
	
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile eğitmen veri tabanına eklendi : " +instructor.getName());
	}
	
}


