package com.cognizant.entityclasses;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="categories")
public class Category {
	
	@Id
	
	@OneToMany
	@JoinColumn(name="CATEGORYID")
	private long categoryID;
	
	@Column(name="CATEGORYNAME",length=40)
	private String categoryName;
	
	private static int currentId = 0;
	
	private static List<Category> allCategories = new ArrayList<Category>();
	
	public Category() {
		super();
	}

	public Category(String categoryName) {
		this.categoryID = ++currentId;
		this.categoryName = categoryName;
		allCategories.add(this);
	}
	
	public long getCategoryId() {
		return categoryID;
	}
	public void setCategoryId(long categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public static void addToCategoryList(Category c) {
		allCategories.add(c);
	}

	/*public static String getCategoryName(long id) {
		for(Category c : allCategories) {
			if(id == c.categoryID)
				return c.categoryName;
		}
		return "None";
	}
	 public static List<Product> searchByCategory(String categoryName) {
		List<Product> relevantProducts = new ArrayList<Product>();
		for(Product p : Product.getAllProducts()) {
			if(getCategoryName(p.getCategoryID()).contains(categoryName)) 
				relevantProducts.add(p);
		}
		return relevantProducts;
	}*/
}