package com.cognizant.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RestController;

import com.cognizant.entityclasses.Cart;
import com.cognizant.dao.CartDao;

@RestController
@RequestMapping("/cart")
public class CartController 
{

	@Autowired
	private CartDao cartdao;
	
	//home
	/*@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	*/
	//cart list
	@GetMapping({"/getCartList"})
	public List<Cart> Cartlist()
	{
		return cartdao.cartlist();
	}
	
	//get single cart by id
	@GetMapping({"/getCart/{id}"})
	public void getCart(@PathVariable int id)
	{
		cartdao.getCartbyId(id);
		
	}
	
	//delete single cart by id
	@GetMapping({"/deleteCart/{id}"})
	public void deletecart(@PathVariable int id)
	{
		cartdao.deletebyCartid(id);
	}
	
	@PostMapping({"insertCart"})
	public Cart insertCart(@RequestBody Cart cart) throws Exception
	{
		return cartdao.insert(cart);
	}


}