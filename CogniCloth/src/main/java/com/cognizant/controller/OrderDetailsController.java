package com.cognizant.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.dao.OrderDetailsDao;
import com.cognizant.entityclasses.OrderDetails;

@RestController
@RequestMapping("/order")
public class OrderDetailsController 
{
	/*	private OrderDetailsDao orderDao;
	
				
		//get categories
		@GetMapping({"/orderdetails/{id}"})
		public OrderDetails getOrderdetails(@PathVariable long id)
		{
			return orderDao.findOrder(id);
			
		}
	     
	*/

}
