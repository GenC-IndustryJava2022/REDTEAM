package com.cognizant.entityclasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customers")

public class Customer {
	
	@Id
	
	@Column(name="CUSTOMERID",length=5)
	private Long customerID;
	
	@Column(name="COMPANYNAME",length=40)
	private String companyName;
	
	@Column(name="CONTACTNAME",length=30)
	private String contactName;
	
	@Column(name="STREET", length=60)
	private String street;
	
	@Column(name="CITY",length=60)
	private String city;
	
	@Column(name="STATE",length=15)
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
	
	//private static int idNumber = 0;
	
	public Customer() {
		super();
		//customerID = String.format("%06d",++idNumber);
	}
	
	public Customer(Long customerID, String companyName, String contactName, String street, String city, String state,
			long productid) {
		super();
		this.customerID = customerID;
		this.companyName = companyName;
		this.contactName = contactName;
		this.street = street;
		this.city = city;
		this.state = state;
		this.productid = productid;
	}

	public Long getCustomerID() {
		return customerID;
	}
	public void setCustomerID(Long customerID) {
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
