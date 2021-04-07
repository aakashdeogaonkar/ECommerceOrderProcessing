package com.ECommerceOrder_Processing.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="customers")
public class Customer {
	
	@Id
	@Column(name="order_custmer_id")
	private long cid;
	
	private String name;
	
	private String email;
	
	@Column(name="order_shipping_addressline1")
	private String shippingAddressLine1;
	
	@Column(name="order_shipping_addressline2")
	private String shippingAddressLine2;
	
	@Column(name="order_shipping_city")
	private String shippingCity;
	
	@Column(name="order_shipping_state")
	private String shippingState;
	
	@Column(name="order_shipping_zip")
	private String shippingZip;
	
	public Customer() {
		
	}
	
	public Customer(long cid, String name, String email, String billingAddressLine1, String billingAddressLine2,
			String billingCity, String billingState, String billingZip, String shippingAddressLine1,
			String shippingAddressLine2, String shippingCity, String shippingState, String shippingZip) {
		super();
		this.cid = cid;
		this.name = name;
		this.email = email;
		this.shippingAddressLine1 = shippingAddressLine1;
		this.shippingAddressLine2 = shippingAddressLine2;
		this.shippingCity = shippingCity;
		this.shippingState = shippingState;
		this.shippingZip = shippingZip;
	}



	public long getCid() {
		return cid;
	}



	public void setCid(long cid) {
		this.cid = cid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getShippingAddressLine1() {
		return shippingAddressLine1;
	}



	public void setShippingAddressLine1(String shippingAddressLine1) {
		this.shippingAddressLine1 = shippingAddressLine1;
	}



	public String getShippingAddressLine2() {
		return shippingAddressLine2;
	}



	public void setShippingAddressLine2(String shippingAddressLine2) {
		this.shippingAddressLine2 = shippingAddressLine2;
	}



	public String getShippingCity() {
		return shippingCity;
	}



	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}



	public String getShippingState() {
		return shippingState;
	}



	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}



	public String getShippingZip() {
		return shippingZip;
	}



	public void setShippingZip(String shippingZip) {
		this.shippingZip = shippingZip;
	}



	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", email=" + email + ", shippingAddressLine1="
				+ shippingAddressLine1 + ", shippingAddressLine2=" + shippingAddressLine2 + ", shippingCity="
				+ shippingCity + ", shippingState=" + shippingState + ", shippingZip=" + shippingZip + "]";
	}
}
