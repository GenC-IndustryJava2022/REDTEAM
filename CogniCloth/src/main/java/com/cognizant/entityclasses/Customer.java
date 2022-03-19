package main.java.com.cognizant.entityclasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Customer")

public class Customer {
	
	@Id
	
	@Column(name="customerid",length=5)
	private String customerID;
	
	@Column(name="companyname",length=40)
	private String companyName;
	
	@Column(name="contactname",length=30)
	private String contactName;
	
	@Column(name="street", length=60)
	private String street;
	
	@Column(name="city",length=60)
	private String city;
	
	@Column(name="state",length=15)
	private String state;
	
	@ManyToOne
	@JoinColumn(name="productid")
	private long productid;
	
	public long getProductid()
	{
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}
	private static int idNumber = 0;
	
	public Customer() {
		customerID = String.format("%06d",++idNumber);
	}
	
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
