package com.cognizant.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import com.cognizant.dao.CategoryService;
import com.cognizant.entityclasses.Category;

@RestController
@RequestMapping("category") 
public class CategoryController {

    

    private CategoryService categoryService;



    public CategoryController(CategoryService categoryService) {

        super();

       System.out.println("catController");

        this.categoryService = categoryService;

    }



    public CategoryService getCategoryService() {

        return categoryService;

    }


    @Autowired
    public void setCategoryService(CategoryService categoryService) {

        this.categoryService = categoryService;

    }

    

    @GetMapping("/all") 
    public List<Category> getAllCategories()

    {
        return categoryService.all();

    }

    

    @PostMapping("/add")
    public Category addCategory(@RequestBody Category category)

    {
    	System.out.println("add");

        return categoryService.save(category);

    }

	@GetMapping({"/categoryDisplay/{categotytitle}"})
	public Category categoryDisplay(@PathVariable int categorytitle)
	{
		return categoryService.getName(categorytitle);
	}
	
	



}


