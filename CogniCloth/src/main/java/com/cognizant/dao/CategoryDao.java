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
	@Autowired
	private CategoryRepository categoryRepository;
	
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