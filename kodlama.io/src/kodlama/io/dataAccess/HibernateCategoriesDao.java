package kodlama.io.dataAccess;

import kodlama.io.entities.Categories;

public class HibernateCategoriesDao implements CategoriesDao{

	@Override
	public void add(Categories categories) {
		System.out.println("Hibernate ile yeni kategori eklendi : "+categories.getName());		
	}

}
