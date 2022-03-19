package com.cognizant.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cognizant.entityclasses.Cart;
import com.cognizant.dao.CartDao;

@Controller
public class CartController 
{

	@Autowired
	private CartDao cartdao;
	
	//home
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	//cart list
	@RequestMapping({"/cartlist"})
	public List<Cart> Cartlist()
	{
		return cartdao.cartlist();
	}
	
	//get single cart by id
	@RequestMapping({"/cartlist/cart"})
	public void getCart(int id)
	{
		cartdao.getCartbyId(id);
		
	}
	
	//delete single cart by id
	@RequestMapping({"/cartlist/cart/delete"})
	public void deletecart(int id)
	{
		cartdao.deletebyCartid(id);
	}
	
	@RequestMapping({"/cartlist/cart/insert"})
	public Cart insertCart(Cart cart) throws Exception
	{
		return cartdao.insert(cart);
	}


}