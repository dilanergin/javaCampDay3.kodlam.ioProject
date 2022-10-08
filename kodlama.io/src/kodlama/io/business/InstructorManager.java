package kodlama.io.business;

import kodlama.io.dataAccess.InstructorDao;
import kodlama.io.entities.Instructor;

public class InstructorManager {
	private InstructorDao dao;
	
	

	public InstructorManager(InstructorDao dao) {
		
		this.dao = dao;
	}



	public void add(Instructor instructor) {
		// business rules
		dao.add(instructor);
		
		
	}

}
