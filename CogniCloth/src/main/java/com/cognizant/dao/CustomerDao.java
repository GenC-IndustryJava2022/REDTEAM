package com.cognizant.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import main.java.com.cognizant.entityclasses.Cart;
import main.java.com.cognizant.entityclasses.Customer;

public class CustomerDao {
	
	@Autowired
	private SessionFactory sessionfactory;

	public Customer getCustomerbyId(int custid)
	{
		Session session = this.sessionfactory.getCurrentSession();
		Customer customer =session.get(Customer.class,custid);
		System.out.println(customer);
		session.close();
		return customer;
	


		
}
