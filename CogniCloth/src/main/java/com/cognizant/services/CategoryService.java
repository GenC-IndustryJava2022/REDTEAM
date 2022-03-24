package com.cognizant.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.cognizant.entityclasses.Category;
import com.cognizant.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;

	public CategoryService()
	{
		super();
	}

	
	public CategoryRepository getCategoryRepository() {
		return categoryRepository;
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