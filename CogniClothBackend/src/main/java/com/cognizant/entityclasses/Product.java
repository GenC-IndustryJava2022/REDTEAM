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
@Table(name="PRODUCTS")

public class Product
{
	
	@Id
	@Column(name="PRODUCTID")
	private int productID;
	
//	@OneToMany
//	@JoinColumn(name="supplierid")
	private int supplierID;
	
//	@OneToMany
//	@JoinColumn(name="categoryid")
	@Column(name="CATEGORYID")
	private long categoryID;
	
	@Column(name="UNITPRICE")
	private float price;
	
	@Column(name="PRODUCTNAME",length=40)
	private String productName;
	
	@Column(name="PRODUCTDESCRIPTION",length=40)
	private String productDescription;
	
	private static List<Product> allProducts = new ArrayList<Product>();
	
	public Product() 
	{
		
	}
	
	public Product(int supplierID, long categoryID, float price, String productName,
			String productDescription, int productID) 
	{
		super();
		this.supplierID = supplierID;
		this.categoryID = categoryID;
		this.price = price;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productID = productID;
	}
	
	@Override
	public String toString() 
	{
		
		return "Product [productID=" + productID + ", supplierID=" + supplierID + ", categoryID=" + categoryID + ", price="
				+ price + ", productName=" + productName + ", productDescription=" + productDescription + "]";
	}
	
	public int getProductID() 
	{
		return productID;
	}
	
	public void setProductID(int productID) 
	{
		this.productID = productID;
	}
	
	public int getSupplierID()
	{
		return supplierID;
	}
	
	public void setSupplierID(int supplierID) 
	{
		this.supplierID = supplierID;
	}
	
	public long getCategoryID()
	{
		return categoryID;
	}
	
	public void setCategoryID(long categoryID)
	{
		this.categoryID = categoryID;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	
	public String getProductDescription()
	{
		return productDescription;
	}
	
	public void setProductDescription(String productDescription)
	{
		this.productDescription = productDescription;
	}
	public static void addToProducts(Product product)
	{
		 allProducts.add(product);
	}
	public static List<Product> getAllProducts() {
		return allProducts;
	}
}