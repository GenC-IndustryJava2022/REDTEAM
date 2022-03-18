package main.java.com.cognizant.CogniCloth.jdbc;

import java.sql.Statement;

import main.java.com.cognizant.CogniCloth.entityclasses.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;



public class JdbcProductSearch {	
	public void create(Product p) {
		
	}
	public void select(Product p) throws SQLException, ClassNotFoundException {
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


	public void update(Product p){
		
	}
		
	public void delete(Product p) {

	}
		
}	

