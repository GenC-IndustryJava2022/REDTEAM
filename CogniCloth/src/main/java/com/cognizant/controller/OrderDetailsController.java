package com.cognizant.controller;


import org.springframework.web.bind.annotation.RequestMapping;

import com.cognizant.dao.OrderDetailsDao;
import com.cognizant.entityclasses.OrderDetails;

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
