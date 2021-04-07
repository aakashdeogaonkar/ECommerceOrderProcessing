package com.ECommerceOrder_Processing.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.sun.istack.Nullable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Entity
@Table(name="billing_address")
//@Embeddable
public class BillingAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="billing_id")
	private long billingId;
	
	@Column(name="order_billing_addressline1")
	private String billingAddressLine1;
	
	@Column(name="order_billing_addressline2")
	private String billingAddressLine2;
	
	@Column(name="order_billing_city")
	private String billingCity;
	
	@Column(name="order_billing_state")
	private String billingState;
	
	@Column(name="order_billing_zip")
	private String billingZip;
	
//	@OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "customer_id_fk", referencedColumnName = "order_custmer_id")
//	private Customer customer;
	
	@OneToOne
	@JoinColumn(name="order_id_fk")
	private Order order;

	public BillingAddress(long billingId, String billingAddressLine1, String billingAddressLine2, String billingCity,
		String billingState, String billingZip, Order order) {
	super();
	this.billingId = billingId;
	this.billingAddressLine1 = billingAddressLine1;
	this.billingAddressLine2 = billingAddressLine2;
	this.billingCity = billingCity;
	this.billingState = billingState;
	this.billingZip = billingZip;
	this.order = order;
}

	public BillingAddress() {
		super();
	}

	public long getBillingId() {
		return billingId;
	}

	public void setBillingId(long billingId) {
		this.billingId = billingId;
	}

	public String getBillingAddressLine1() {
		return billingAddressLine1;
	}

	public void setBillingAddressLine1(String billingAddressLine1) {
		this.billingAddressLine1 = billingAddressLine1;
	}

	public String getBillingAddressLine2() {
		return billingAddressLine2;
	}

	public void setBillingAddressLine2(String billingAddressLine2) {
		this.billingAddressLine2 = billingAddressLine2;
	}

	public String getBillingCity() {
		return billingCity;
	}

	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}

	public String getBillingState() {
		return billingState;
	}

	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}

	public String getBillingZip() {
		return billingZip;
	}

	public void setBillingZip(String billingZip) {
		this.billingZip = billingZip;
	}

	@Override
	public String toString() {
		return "BillingAddress [billingId=" + billingId + ", billingAddressLine1=" + billingAddressLine1
				+ ", billingAddressLine2=" + billingAddressLine2 + ", billingCity=" + billingCity + ", billingState="
				+ billingState + ", billingZip=" + billingZip + "]";
	}
}
