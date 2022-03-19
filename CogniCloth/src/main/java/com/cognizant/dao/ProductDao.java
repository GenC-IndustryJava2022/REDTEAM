package main.java.com.cognizant.dao;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.cognizant.entityclasses.Product;


public final class ProductDao 
{
@Autowired
private SessionFactory sessionFactory;

public Product getProduct(int id)
{
			String sql="Select productid from"+ProductDao.class.getName()+" p where p.id=:id";	
	
			Session session =this.sessionFactory.getCurrentSession();
			Query<Product> query = session.createQuery(sql,Product.class);
			query.setParameter("productid",id);
	
			return(Product) query.getSingleResult();	
}
	
	
	


public Product getProductDetails(String Description)
{
	Product p = this.getProduct()
}

}
