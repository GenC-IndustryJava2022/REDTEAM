package com.cognizant.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.dao.CategoryDao;
import com.cognizant.entityclasses.Category;

@Controller
public class CategoryController
{

@Autowired	
private CategoryDao catdao;

	//home
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	//get categories
	@RequestMapping({"/categorylist"})
	public  List<Category> getcategorylist()
	{
		return catdao.categorylist();
	}
	
	// get category from category list
	@RequestMapping("{/categorylist/category}")
	public Category categoryDisplay(String categorytitle)
	{
		return catdao.getName(categorytitle);
	}

	// update category from list
	@RequestMapping("{/categorylist/category/update}")
	public void categoryUpdate(Category category)
	{
		catdao.updateCategory(category);
	}
	
}
