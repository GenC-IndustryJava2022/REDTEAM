//package com.cognizant.entityclasses;
//
//import java.util.ArrayList;
//import java.util.List;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="cart")
//
//public class Cart {
//	
//	@Id
//	@JoinColumn(name="cartid")
//	private long Cartid;
//	
//	@Column(name="customerid")
//	
//	private long Customerid;
//	
//	@Column(name="orderid")
//	private long Orderid;
//	
//	public long getOrderid() {
//		return Orderid;
//	}
//	private final List<Cart> cartlist = new ArrayList<Cart>();
//
//	public void setOrderid(long orderid) {
//		Orderid = orderid;
//	}
//	    public List<Cart> getCarts()
//	    {
//	       return this.cartlist;
//	    	
//	    }
//	private List<Product> myCart;
//	
//	public Cart() {
//		
//	}
//	
//	public Cart(long cartid, long customerid, long orderid, List<Product> myCart) {
//		super();
//		Cartid = cartid;
//		Customerid = customerid;
//		Orderid = orderid;
//		this.myCart = myCart;
//	}
//	
//	public long getCustomerid() {
//		return Customerid;
//	}
//
//	public void setCustomerid(long customerid) {
//		Customerid = customerid;
//	}
//
//	public List<Product> getMyCart() {
//		return myCart;
//	}
//	
//	public void addToCart(Product p) {
//		myCart.add(p);
//	}
//	
//	public long getCartid() {
//		return Cartid;
//	}
//
//	public void setCartid(long cartid) {
//		Cartid = cartid;
//	}
//
//	public boolean removeFromCart(Product p) {
//		return myCart.remove(p);
//	}
//
//}