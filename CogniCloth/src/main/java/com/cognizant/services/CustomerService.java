package com.cognizant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import com.cognizant.entityclasses.Customer;
import com.cognizant.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public Customer getCustomerbyId(int custid)
	{
		return customerRepository.getById((long)custid);
	}
}
