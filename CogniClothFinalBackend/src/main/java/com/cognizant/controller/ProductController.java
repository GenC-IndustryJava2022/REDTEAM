package com.cognizant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//
import org.springframework.web.bind.annotation.*;
//
//
import com.cognizant.dao.ProductDao;
import com.cognizant.entityclasses.Category;
import com.cognizant.entityclasses.Product;

@RestController
@RequestMapping("/product")
public class ProductController 
{
		
	    private ProductDao productdao;
	    
	    
	
	    public ProductController(ProductDao productdao) {
			super();
			this.productdao = productdao;
		}
	    
	    public ProductDao getProductdao() {
			return productdao;
		}
	    
	    @Autowired
		public void setProductdao(ProductDao productdao) {
			this.productdao = productdao;
		}


		//		/*@RequestMapping("/")
//		public String home()
//		{
//			return "index";
//		}*/
//		
		//get product list
	    @GetMapping({"/all"})
		public  List<Product> getproductlist()
		{
			return productdao.getAllProducts();
		}
	    
	    @PostMapping("/add")
	    public Product addProduct(@RequestBody Product product)
	    {
	        return productdao.save(product);

	    }
//		
//		//get product by id
//	    @GetMapping({"/getProduct/{id}"})
//		public Product getProduct(@PathVariable int id)
//		{
//			return productdao.getProduct(id);			
//		}
		
		// delete product by id
//	    @DeleteMapping({"/deleteProduct/{id}"})
//		public void deleteProduct(@PathVariable int id)
//		{
//			productdao.deleteProduct(id);
//		}
		
		
}
		
