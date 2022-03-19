package main.java.com.cognizant.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import main.java.com.cognizant.dao.OrderDetailsDao;
import main.java.com.cognizant.entityclasses.OrderDetails;

public class OrderDetailsController 
{
		private OrderDetailsDao orderDao;
	
				
		//get categories
		@RequestMapping({"/cart/orderdetails"})
		public OrderDetails getOrderdetails(long id)
		{
			return orderDao.findOrder(id);
			
		}
	     
	

}
