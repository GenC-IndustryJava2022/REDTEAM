package main.java.com.cognizant.CogniCloth.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.cognizant.CogniCloth.entityclasses.Product;

public final class ProductDao 
{
@Autowired
private SessionFactory sessionFactory;

public Product getProduct(int id)
{
	String sql="Select productid from"+Product.class.getName()+" p where p.id=:id";
	
	Session session =S
	
}

public Product getProductDetails(String Description)
{
	Product p = new Product(
}

}
