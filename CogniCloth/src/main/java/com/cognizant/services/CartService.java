package com.cognizant.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import com.cognizant.entityclasses.Cart;
import com.cognizant.repository.CartRepository;

@Service
public class CartService {
	
	@Autowired
	private CartRepository cartRepository;

	public Cart insert(Cart cart) throws Exception
	{	
		return cartRepository.save(cart);
	}
	
	public void deletebyCartid(int id) 
	{
		cartRepository.deleteById((long)id);
		
	}
	
	public Cart getCartbyId(int cartid)
	{
		return cartRepository.findById((long)cartid).get();
	}

	public List<Cart> cartlist() 
	{
		return cartRepository.findAll();
		
	}

	public CartRepository getCartRepository() {
		return cartRepository;
	}

	public void setCartRepository(CartRepository cartRepository) {
		this.cartRepository = cartRepository;
	}
}
	
	

