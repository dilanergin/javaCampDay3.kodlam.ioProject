package kodlama.io.business;

import kodlama.io.dataAccess.CourseDao;
import kodlama.io.dataAccess.JdbcCategoriesDao;
import kodlama.io.dataAccess.JdbcCourseDao;
import kodlama.io.entities.Categories;
import kodlama.io.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	
	public CourseManager(CourseDao courseDao) {
		
		this.courseDao = courseDao;
	}

	public void add(Course course) throws Exception {
		if(course.getPrice()<0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
			
		}
		
		courseDao.add(course);
	}
	
}
