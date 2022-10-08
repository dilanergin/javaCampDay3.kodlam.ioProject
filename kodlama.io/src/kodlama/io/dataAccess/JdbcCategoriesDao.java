package kodlama.io.dataAccess;

import kodlama.io.entities.Categories;

public class JdbcCategoriesDao implements CategoriesDao {
	public void add(Categories categories) {
		System.out.println("Jdbc ile yeni kategori eklendi : "+categories.getName());
	}
}
