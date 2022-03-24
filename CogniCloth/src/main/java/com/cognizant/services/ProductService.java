package com.cognizant.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.entityclasses.Product;

//@Service
public final class ProductService 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}


	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public List<Product> productlist() 
	{
		  Session session = this.sessionFactory.getCurrentSession();
		  String sql="select *from"+Product.class.getName();
		  Query<Product> q = session.createQuery(sql,Product.class);
		  List<Product> productlist = q.list();
		  return productlist;
	}	
	
	
	public Product getProduct(int id)
	{
			String sql="Select productid from"+ProductService.class.getName()+" p where p.id=:id";	
			Session session =this.sessionFactory.getCurrentSession();
			Query<Product> query = session.createQuery(sql,Product.class);
			query.setParameter("productid",id);
			
			return(Product) query.getSingleResult();	
	}
		
		
	
	public void deleteProduct(int Id)
	{
		Session session =this.sessionFactory.getCurrentSession();
		Product product =session.get(Product.class,Id);
		session.delete(product);
		session.close();
	}	
}