package com.cognizant.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import com.cognizant.entityclasses.Customer;
import com.cognizant.repository.CustomerRepository;

@Service
public class CustomerDao {

//	@Autowired
	private CustomerRepository customerRepository;
	
	public CustomerDao() {
		super();
	}

	public CustomerDao(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	
	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public Customer getCustomerbyId(int custid) {
		return customerRepository.getById((long)custid);
	}
}
