package main.java.com.cognizant.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.cognizant.entityclasses.Cart;

public class CartDao {
	@Autowired
	private SessionFactory sessionfactory;

	public Cart insert(Cart cart) throws Exception
	{	Session session = this.sessionfactory.getCurrentSession();

		try {
			session.save(cart);
			session.close();
			return cart;
		}
		catch (HibernateException e) {
			throw new Exception("Cannot save cart",e);
		}
		
	}
	
	public void deletebyCartid(int id) 
	{
		Session session = this.sessionfactory.getCurrentSession();
		session.delete("from " + Cart.class.getName() + " where id = " + id);
		session.close();
		
	}
	
	public Cart getCartbyId(int cartid)
	{
		Session session = this.sessionfactory.getCurrentSession();
		Cart cart =session.get(Cart.class,cartid);
		System.out.println(cart);
		session.close();
		return cart;
	}

	public List<Cart> cartlist() 
	{
		Session session = this.sessionfactory.getCurrentSession();
		Query q = session.createQuery("from "+Cart.class.getName());
		List<Cart> cartlist = q.list();
		return cartlist;
		
	}
}
	
	

