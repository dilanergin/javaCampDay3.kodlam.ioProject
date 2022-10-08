package kodlama.io.business;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.CategoriesDao;
import kodlama.io.dataAccess.JdbcCategoriesDao;
import kodlama.io.entities.Categories;

public class CategoiesManager {
	private CategoriesDao categoriesDao;
	private Logger[] loggers;
	
	public static List<String> category= new ArrayList<>();

	
	public CategoiesManager(CategoriesDao categoriesDao, Logger[] loggers) {
		this.categoriesDao = categoriesDao;
		this.loggers=loggers;
	}

	public void add(Categories categories) throws Exception{
		//iş kuralları
		//hata mesajı eklenec
		
		if(category.contains(categories.getName())) {
			throw new Exception("Bu kategori zaten ekli");
		}else {
			categoriesDao.add(categories);
		}
		
		
		
		//polymorphzm
		for(Logger logger : loggers) {
			logger.log(categories.getName());
		
	}
}
}