package main.java.com.cognizant.CogniCloth.jdbc;

import java.sql.Statement;

import main.java.com.cognizant.CogniCloth.dao.ProductDao;
import main.java.com.cognizant.CogniCloth.entityclasses.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JdbcProductSearch implements ProductDao 
{	
	//Adds product to table
	public void add(Product p) throws ClassNotFoundException, SQLException {
		String productName;
		try { 
			Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "SELECT * FROM Products WHERE productName LIKE %" + p.getProductName() + "%";
			ResultSet r = smt.executeQuery(sql);
			StringBuilder sb = new StringBuilder();

			while (r.next()) {
				productName = r.getString("productName");
				sb.append(productName);
				sb.append(", ");
			}
			sb.delete(sb.length()-2, sb.length());
			System.out.println(sb.toString());
		}
		catch(SQLException e ) {
		  e.printStackTrace();
		}
	}

	//Returns the name of each product that matches the search
	public void select(Product p) throws ClassNotFoundException, SQLException {
		String productName;
		try { 
			Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "SELECT * FROM Products WHERE productName LIKE %" + p.getProductName() + "%";
			ResultSet r = smt.executeQuery(sql);
			StringBuilder sb = new StringBuilder();

			while (r.next()) {
				productName = r.getString("productName");
				sb.append(productName);
				sb.append(", ");
			}
			sb.delete(sb.length()-2, sb.length());
			System.out.println(sb.toString());
		}
		catch(SQLException e ) {
		  e.printStackTrace();
		}
	}
		
	//Deletes the product from the table
	public void delete(Product p) throws ClassNotFoundException, SQLException {
		try { 
			Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "DELETE FROM Products WHERE productName LIKE %" + p.getProductName() + "%";
			ResultSet r = smt.executeQuery(sql);
		}
		catch(SQLException e ) {
			e.printStackTrace();
		}
	}

	//Prints out every product name except Product p
	public void remove(Product p) throws ClassNotFoundException, SQLException {
		try {    
			Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "SELECT * FROM Products WHERE productName NOT LIKE %" + p.getProductName() + "%";
			ResultSet r = smt.executeQuery(sql);
			StringBuilder sb = new StringBuilder();
		
			while (r.next()) {
				String productName = r.getString("productName");
				sb.append(productName);
				sb.append(", ");
			}
			sb.delete(sb.length()-2, sb.length());
			System.out.println(sb.toString());
		}
		catch(SQLException e ){
			e.printStackTrace();
		}
	}
}
	
	

