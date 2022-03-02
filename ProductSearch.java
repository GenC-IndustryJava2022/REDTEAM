package com.cognizant.CogniCloth;

public class ProductSearch extends Search{
	private String productDescription;
	private String ProductName;
	
	public String getProductDescription() {
		return productDescription;
	}
	
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	public String getProductName() {
		return ProductName;
	}
	
	public void setProductName(String productName) {
		ProductName = productName;
	}

	public ProductSearch(double price, long categoryId, long supplierId, long productId, String productDescription,
			String productName) {
		super(price, categoryId, supplierId, productId);
		this.productDescription = productDescription;
		ProductName = productName;
	}

	public ProductSearch(double price, long categoryId, long supplierId, long productId) {
		super(price, categoryId, supplierId, productId);
		// TODO Auto-generated constructor stub
	}

	
}