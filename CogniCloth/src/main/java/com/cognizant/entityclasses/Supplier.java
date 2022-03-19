package com.cognizant.entityclasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")

public class Supplier {
	
	@Id
	@Column(name="supplierid")
	private long SupplierID;
	
	@Column(name="companyname")
	private String CompanyName;
	
	@ManyToOne
	@JoinColumn(name="contactname")
	private String ContactName;
	
	@ManyToOne
	@JoinColumn(name="productid")
	private long productid;

	public long getSupplierID() {
		return SupplierID;
	}

	public void setSupplierID(long supplierID) {
		SupplierID = supplierID;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getContactName() {
		return ContactName;
	}

	public void setContactName(String contactName) {
		ContactName = contactName;
	}

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}
	
	
	
}