package main.java.com.cognizant.CogniCloth.jdbc;

import java.sql.Statement;
import main.java.com.cognizant.CogniCloth.entityclasses.Category;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcCategorySearch implements CategoryDao
{

	//Adds category to table
	public void add(Category c) throws ClassNotFoundException, SQLException {
		try 
		{    
		    Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "INSERT INTO Category(categoryId, categoryName) VALUES (" + c.getCategoryId() + ", " + c.getCategoryName() + ")";
			ResultSet r = smt.executeQuery(sql);
			StringBuilder sb = new StringBuilder();
			Category.addToCategoryList(c);
		  }
		catch(SQLException e )
		{
		  e.printStackTrace();
		}
	}

	//Returns the name of each category that matches the search
	public void select(Category c) throws ClassNotFoundException, SQLException {
		try {    
		    Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "SELECT * FROM Products p JOIN Category c ON p.categoryID = c.categoryID WHERE c.categoryName LIKE %" + c.getCategoryName() + "%";
			ResultSet r = smt.executeQuery(sql);
			StringBuilder sb = new StringBuilder();
	
			while (r.next()) {
				long categoryId = r.getLong("categoryid");
				String categoryName = r.getString("categoryName");
				sb.append(categoryName);
				sb.append(", ");
		  	}
			sb.delete(sb.length()-2, sb.length());
			System.out.println(sb.toString());
		  }
		catch(SQLException e ) {
		  e.printStackTrace();
		}
	}
		
	//Delete any items from selected category + deletes category itself
	public void delete(Category c) throws ClassNotFoundException, SQLException {
		try {    
		        Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "DELETE * FROM Products p JOIN Category c ON p.categoryID = c.categoryID WHERE c.categoryName LIKE %" + c.getCategoryName() + "%";
			smt.executeQuery(sql);
			sql = "DELETE * FROM Category WHERE categoryName LIKE %" + c.getCategoryName() + "%";
			smt.executeQuery(sql);
		  }
		catch(SQLException e ) {
		  e.printStackTrace();
		}
	}
	
	//Prints out all products that are not in the selected category
	public void remove(Category c) throws ClassNotFoundException, SQLException {
		try {    
		        Connection con = DBConnection.getConnection();
			Statement smt = con.createStatement();
			String sql = "SELECT * FROM Products p JOIN Category c ON p.categoryID = c.categoryID WHERE c.categoryName NOT LIKE %" + c.getCategoryName() + "%";
			ResultSet r = smt.executeQuery(sql);
			StringBuilder sb = new StringBuilder();
	
			while (r.next()) {
				long categoryId = r.getLong("categoryid");
				String categoryName = r.getString("categoryName");
				sb.append(categoryName);
				sb.append(", ");
		  	}
			sb.delete(sb.length()-2, sb.length());
			System.out.println(sb.toString());
		  }
		catch(SQLException e ) {
		  e.printStackTrace();
		}
	}
}
 
