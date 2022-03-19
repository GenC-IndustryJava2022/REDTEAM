package main.java.com.cognizant.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import main.java.com.cognizant.dao.ProductDao;
import main.java.com.cognizant.entityclasses.Product;

public class ProductController 
{
	    private ProductDao productdao;
		//home
		@RequestMapping("/")
		public String home()
		{
			return "index";
		}
		
		//get product list
		@RequestMapping({"/productlist"})
		public  List<Product> getproductlist()
		{
			return productdao.productlist();
		}
		
		//get product by id
		@RequestMapping({"/productlist/product"})
		public Product getProduct(int id)
		{
			return productdao.getProduct(id);
			
		}
		
		// delete product by id
		@RequestMapping({"/productlist/product/delete"})
		public void deleteProduct(int id)
		{
			productdao.deleteProduct(id);
		}
		
		
}
		
