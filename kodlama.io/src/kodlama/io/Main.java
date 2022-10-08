package kodlama.io;

import kodlama.io.business.CategoiesManager;
import kodlama.io.business.CourseManager;
import kodlama.io.business.InstructorManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.HibernateCategoriesDao;
import kodlama.io.dataAccess.HibernateCourseDao;
import kodlama.io.dataAccess.HibernateInstructorDao;
import kodlama.io.dataAccess.JdbcCategoriesDao;
import kodlama.io.dataAccess.JdbcCourseDao;
import kodlama.io.entities.Categories;
import kodlama.io.entities.Course;
import kodlama.io.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Instructor instructor = new Instructor("Dilan","Ergin","dilan@");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao());
		instructorManager.add(instructor);
		
		Categories categories1 = new Categories(1,"java");
		Categories categories2 = new Categories(2,"lkkjjh");
		Categories categories3 = new Categories(9,"java");
		Logger[] loggers = {new DatabaseLogger(), new MailLogger(), new FileLogger()};
		
		
		CategoiesManager categoiesManager = new CategoiesManager(new HibernateCategoriesDao(),loggers);
		categoiesManager.add(categories1);
		categoiesManager.add(categories2);
		categoiesManager.add(categories3);
	
	
		Course course1= new Course("java kamp",234);
		Course course2 = new Course("java kamp",-90);
		CourseManager courseManager = new CourseManager(new JdbcCourseDao());
		courseManager.add(course1);
		courseManager.add(course2); 
		
	}

}
