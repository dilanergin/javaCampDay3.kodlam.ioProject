package kodlama.io.dataAccess;

import kodlama.io.entities.Course;

public class JdbcCourseDao implements CourseDao{
	public void add(Course course) {
		System.out.println("Jdbc ile yeni kurs eklendi : " +course.getName());
	}
	
}
