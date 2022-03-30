package com.cognizant.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.cognizant.entityclasses.Category;
import com.cognizant.entityclasses.Product;
import com.cognizant.repository.ProductRepository;

@Service
public final class ProductDao 
{
	
	private ProductRepository productRepository;
	
	public ProductDao(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	public ProductRepository getProductRepository() {
		return productRepository;
	}

	public void setProductRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public List<Product> getAllProducts() 
	{
		return productRepository.findAll();
	}	
	 
   public Product save(Product prod) 
   {
	   	return productRepository.save(prod);
   }
}
//	
//	public ProductDao(SessionFactory sessionFactory) {
//		super();
//		this.sessionFactory = sessionFactory;
//	}
//
//
//
//	private SessionFactory sessionFactory;
//	
//	public List<Product> productlist() 
//	{
//		  Session session = this.sessionFactory.getCurrentSession();
//		  String sql="select *from"+Product.class.getName();
//		  Query<Product> q = session.createQuery(sql,Product.class);
//		  List<Product> productlist = q.list();
//		  return productlist;
//	}	
//	
//	
//	public Product getProduct(int id)
//	{
//			String sql="Select productid from"+ProductDao.class.getName()+" p where p.id=:id";
//			Query<Product> query = session.createQuery(sql,Product.class);
//			query.setParameter("productid",id);
//			
//			return(Product) query.getSingleResult();	
//	}
//}
//		
//		
//	
//	public void deleteProduct(int Id)
//	{
//		Session session =this.sessionFactory.getCurrentSession();
//		Product product =session.get(Product.class,Id);
//		session.delete(product);
//		session.close();
//	}	
//}