package com.cognizant.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.cognizant.entityclasses.Category;
import com.cognizant.repository.CategoryRepository;

@Service
public class CategoryDao {

//	@Autowired
	private CategoryRepository categoryRepository;
	
//	public CategoryDao() {
//		
//	}
	
//	@Autowired
//	public CategoryDao(CategoryRepository categoryRepository) {
//		super();
//		this.categoryRepository = categoryRepository;
//	}
	
	
	
	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
	}

	public CategoryDao() {
		super();
	}


	public CategoryDao(CategoryRepository categoryRepository) {
		super();
		this.categoryRepository = categoryRepository;
	}

	public void setCategoryRepository(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public Category getName(int id) 
	{
		return categoryRepository.getById((long)id);
	}
	
	public List<Category> categorylist() 
	{
		return categoryRepository.findAll();
	}	
	 
   public void updateCategory(Category category) 
   {
	   	categoryRepository.saveAndFlush(category) ;
   }
}