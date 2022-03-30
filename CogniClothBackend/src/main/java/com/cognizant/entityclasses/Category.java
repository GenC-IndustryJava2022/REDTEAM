package com.cognizant.entityclasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;



@Entity
@Table(name="CATEGORIES")
public class Category {
	
	@Id
	@JoinColumn(name="category_id", referencedColumnName="CATEGORYID")
	private int categoryID;
	@Column(name="CATEGORYNAME")
	private String categoryName;
	private String description;
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int categoryID, String categoryName, String description) {
		super();
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.description = description;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", categoryName=" + categoryName + ", description=" + description
				+ "]";
	}
	
	
	
	
	//@Entity
	//@Table(name="Category")
	//public class Category {
	//	
//		@Id
	//	
//		@OneToMany
//		@JoinColumn(name="categoryid")
//		private long categoryID;
	//	
//		@Column(name="categoryname",length=40)
//		private String categoryName;
	//	
//		private static int currentId = 0;
	//	
//		private static List<Category> allCategories = new ArrayList<Category>();
	//	
//		public Category() {
//			super();
//		}
	//
//		public Category(String categoryName) {
//			this.categoryID = ++currentId;
//			this.categoryName = categoryName;
//			allCategories.add(this);
//		}
	//	
//		public long getCategoryId() {
//			return categoryID;
//		}
//		public void setCategoryId(long categoryID) {
//			this.categoryID = categoryID;
//		}
//		public String getCategoryName() {
//			return categoryName;
//		}
//		public void setCategoryName(String categoryName) {
//			this.categoryName = categoryName;
//		}
	//
//		public static void addToCategoryList(Category c) {
//			allCategories.add(c);
//		}
	//
//		public static String getCategoryName(long id) {
//			for(Category c : allCategories) {
//				if(id == c.categoryID)
//					return c.categoryName;
//			}
//			return "None";
//		}
//		public static List<Product> searchByCategory(String categoryName) {
//			List<Product> relevantProducts = new ArrayList<Product>();
//			for(Product p : Product.getAllProducts()) {
//				if(getCategoryName(p.getCategoryID()).contains(categoryName)) 
//					relevantProducts.add(p);
//			}
//			return relevantProducts;
//		}
	



}