package com.cognizant.dao;

//import org.hibernate.query.Query;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.cognizant.entityclasses.OrderDetails;
//
//import org.springframework.stereotype.*;

////@Service
//public class OrderDetailsDao {
//
//public OrderDetailsDao(SessionFactory sessionfactory) {
//		super();
//		this.sessionfactory = sessionfactory;
//	}
//
//private SessionFactory sessionfactory;
//
//@SuppressWarnings("null")
//public int getMaximumOrder()
//{
//	String sql ="select max(or.quantity) from"+OrderDetails.class.getName()+"or";
//	
//	Session session = this.sessionfactory.getCurrentSession();
//    Query<Integer>query =session.createQuery(sql,Integer.class);
//    
//    int value = (int)query.getSingleResult();
//    
//    if (value==0) {return (Integer) null;}
//    return value;
//    
//}
//
//public OrderDetails findOrder(long orderid)
//{
//	Session session =this.sessionfactory.getCurrentSession();
//	return session.find(OrderDetails.class,orderid);
//}
//
//
//}
