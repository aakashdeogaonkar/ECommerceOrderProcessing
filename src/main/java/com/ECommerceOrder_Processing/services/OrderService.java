package com.ECommerceOrder_Processing.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ECommerceOrder_Processing.models.Item;
import com.ECommerceOrder_Processing.models.Order;
import com.ECommerceOrder_Processing.repositories.ItemRepository;
import com.ECommerceOrder_Processing.repositories.OrderRepository;
import com.ECommerce_order_processing.dto.OrderRequest;

@Service
public class OrderService {
	
	private final OrderRepository orderRepository;
	private final ItemRepository itemRepository;
	
	@Autowired
	public OrderService(OrderRepository orderRepository, ItemRepository itemRepository) {
		this.orderRepository = orderRepository;
		this.itemRepository = itemRepository;
	}

	public List<Order> getOrder() {
		return orderRepository.findAll();
	}

	public Order createOrder(OrderRequest orderRequest) {
		return orderRepository.save(orderRequest.getOrder());
	}
	
	public void saveItem(Item item) {
		itemRepository.save(item);
	}

	public void deleteOrderById(Long id) {
		Boolean exists = orderRepository.existsById(id);
		if(!exists)
			throw new IllegalStateException("Order with Id:" + id + " does not exists");
		
		orderRepository.deleteById(id);
	}

	public Order getOrderById(Long orderId) {
		Boolean exists = orderRepository.existsById(orderId);
		if(!exists)
			throw new IllegalStateException("Order with Id:" + orderId + " does not exists");
		
		return orderRepository.findByOrderId(orderId);
	}

}
