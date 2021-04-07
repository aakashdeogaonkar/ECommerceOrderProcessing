package com.ECommerceOrder_Processing.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {
	@Id
	@SequenceGenerator(name = "order_sequence", sequenceName = "order_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "order_sequence")
	@Column(name="order_id")
	private Long orderId;
	private String status;
	
	@Column(name = "order_shipping_charges")
	private double shippingCharge;
	
	@Column(name = "order_subtotal")
	private double orderSubTotal;
	
	@OneToMany(targetEntity = Item.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_id_fk", referencedColumnName = "order_id")
	private List<Item> itemList;
	
	@OneToOne(targetEntity = Customer.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "order_customer_fk", referencedColumnName = "order_custmer_id")
	private Customer customer;
	
//	@OneToOne(targetEntity = BillingAddress.class, cascade = CascadeType.ALL)
//	@JoinColumn(name = "order_id_fk", referencedColumnName = "order_id")
//	private BillingAddress billingAddress;
	
	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private Payment payment;
	
	@OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	private BillingAddress billingAddress;

	public Order() {
	}

	public Order(Long orderId, String status, double shippingCharge, double orderSubTotal, List<Item> itemList,
			Customer customer, Payment payment, BillingAddress billingAddress) {
		super();
		this.orderId = orderId;
		this.status = status;
		this.shippingCharge = shippingCharge;
		this.orderSubTotal = orderSubTotal;
		this.itemList = itemList;
		this.customer = customer;
		this.payment = payment;
		this.billingAddress = billingAddress;
	}



	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}

	public double getShippingCharge() {
		return shippingCharge;
	}

	public void setShippingCharge(double shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

	public double getOrderSubTotal() {
		return orderSubTotal;
	}

	public void setOrderSubTotal(double orderSubTotal) {
		this.orderSubTotal = orderSubTotal;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", status=" + status + ", shippingCharge=" + shippingCharge
				+ ", orderSubTotal=" + orderSubTotal + ", itemList=" + itemList + ", customer=" + customer
				+ "]";
	}
}
