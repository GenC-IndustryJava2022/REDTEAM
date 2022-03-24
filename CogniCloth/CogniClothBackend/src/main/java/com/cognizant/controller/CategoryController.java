package com.cognizant.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.cognizant.dao.CategoryDao;
import com.cognizant.entityclasses.Category;

@RestController
@CrossOrigin
@RequestMapping("/categories")
public class CategoryController
{

@Autowired	
private CategoryDao catdao;

	//home
	/*@RequestMapping("/")
	public String home()
	{
		return "index";
	}*/
	
	public CategoryController(CategoryDao catdao) {
		this.catdao = catdao;
	}
	
	public CategoryController() {
		super();
	}

	public CategoryDao getCatdao() {
		return catdao;
	}

	public void setCatdao(CategoryDao catdao) {
		this.catdao = catdao;
	}


	//get categories
	@GetMapping({"/categorylist"})
	public  List<Category> getcategorylist()
	{
		return catdao.categorylist();
	}
	
	// get category from category list
	@GetMapping({"/categoryDisplay/{categorytitle}"})
	public Category categoryDisplay(@PathVariable int categorytitle)
	{
		return catdao.getName(categorytitle);
	}

	// update category from list
	@RequestMapping({"/categoryUpdate"})
	public void categoryUpdate(@RequestBody Category category)
	{
		catdao.updateCategory(category);
	}
	
}
