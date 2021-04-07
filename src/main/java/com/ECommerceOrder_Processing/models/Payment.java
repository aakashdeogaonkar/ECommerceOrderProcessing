package com.ECommerceOrder_Processing.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="payments")
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="payment_id")
	private Long paymentId;
	
	@Column(name="payment_date")
	private Date paymentDate;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="order_id_fk")
	private Order order;
//	
//	@OneToOne(targetEntity = BillingAddress.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "billing_address_id_fk", referencedColumnName = "billing_id")
//	private BillingAddress billingAddress;

	public Long getPaymentId() {
		return paymentId;
	}

	public Payment(Long paymentId, Date paymentDate, Order order) {
	this.paymentId = paymentId;
	this.paymentDate = paymentDate;
	this.order = order;
	}
	
	public Payment() {
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", order=" + order + "]";
	}

//	public Order getOrder() {
//		return order;
//	}

//	public void setOrder(Order order) {
//		this.order = order;
//	}
//
//	public BillingAddress getBillingAddress() {
//		return billingAddress;
//	}
//
//	public void setBillingAddress(BillingAddress billingAddress) {
//		this.billingAddress = billingAddress;
//	}
//
//	@Override
//	public String toString() {
//		return "Payment [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", order=" + order
//				+ ", billingAddress=" + billingAddress + "]";
//	}
	
//	@OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "customer_id_fk", referencedColumnName = "order_custmer_id")
//	private Customer customer;
}
