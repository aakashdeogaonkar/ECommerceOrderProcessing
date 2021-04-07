package com.ECommerce_order_processing.dto;

import com.ECommerceOrder_Processing.models.Order;

public class OrderRequest {
	
	private Order order;

	public OrderRequest(Order order) {
		super();
		this.order = order;
	}
	
	public OrderRequest() {
		
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "OrderRequest [order=" + order + "]";
	}
}
