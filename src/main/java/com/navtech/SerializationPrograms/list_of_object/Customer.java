package com.navtech.SerializationPrograms.list_of_object;

import java.io.Serializable;

public class Customer implements Serializable {
	
	// Private Customer Properties or Fields
	private static final long serialVersionUID = 1L;
	private long custId;
	private String custName;
	private String custAddress;
	private String custMobile;

	// Default Constructor
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	// Parameterized Constructor
	public Customer(long custId, String custName, String custAddress, String custMobile) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.custMobile = custMobile;
	}

	// Getter-Setter
	public long getCustId() {
		return custId;
	}

	public void setCustId(long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddress() {
		return custAddress;
	}

	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	public String getCustMobile() {
		return custMobile;
	}

	public void setCustMobile(String custMobile) {
		this.custMobile = custMobile;
	}

	@Override
	public String toString() {
		return String.format(
				"\n Customer ID : %d \n Customer Name : %s \n " + "Customer Address : %s \n Customer Mobile : %s \n",
				this.getCustId(), this.getCustName(), this.getCustAddress(), this.getCustMobile());
	}

}
