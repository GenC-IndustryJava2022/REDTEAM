package com.cognizant.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.cognizant.dao.CustomerDao;
import com.cognizant.entityclasses.Customer;

@RestController
@RequestMapping("/customer")
public class CustomerController 
{
	@Autowired
    private CustomerDao custdao;
	
	/*@RequestMapping("/")
	public String home()
	{
		return "index";
	}*/
	
	public CustomerController(CustomerDao custdao) {
		super();
		this.custdao = custdao;
	}

	public CustomerController() {
		super();
	}
	
	public CustomerDao getCustdao() {
		return custdao;
	}

	public void setCustdao(CustomerDao custdao) {
		this.custdao = custdao;
	}

	//get categories
	@GetMapping({"/customerDetails/{id}"})
	public  Customer getcustomerdetails(@PathVariable int id)
	{	
		return custdao.getCustomerbyId(id);
	}
}
