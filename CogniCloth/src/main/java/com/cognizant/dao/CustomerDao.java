package main.java.com.cognizant.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.cognizant.entityclasses.Customer;

public class CustomerDao {
	
	@Autowired
	private SessionFactory sessionfactory;

	public Customer findCustomerbyContactNAme(String contactname){
		Session session = this.sessionfactory.getCurrentSession();
		return session.find(Customer.class,contactname);
	}


		
}
