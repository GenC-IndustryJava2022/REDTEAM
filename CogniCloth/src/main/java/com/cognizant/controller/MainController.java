package main.java.com.cognizant.CogniCloth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import main.java.com.cognizant.CogniCloth.dao.CartDao;
import main.java.com.cognizant.CogniCloth.dao.CategoryDao;
import main.java.com.cognizant.CogniCloth.dao.CustomerDao;
import main.java.com.cognizant.CogniCloth.dao.OrderDetailsDao;
import main.java.com.cognizant.CogniCloth.dao.ProductDao;
import main.java.com.cognizant.CogniCloth.dao.SupplierDao;

@Controller
public class MainController
{
	@Autowired
	private CartDao cartdao;
	
	@Autowired
	private CategoryDao catdao;
	
	@Autowired
	private CustomerDao custdao;
	
	@Autowired
	private OrderDetailsDao orderdao;
	
	@Autowired
	private ProductDao productdao;
	
	@Autowired
	private SupplierDao supplierdao;
	
	
	
	

}
