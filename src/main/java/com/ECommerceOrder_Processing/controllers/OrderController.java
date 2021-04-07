package com.ECommerceOrder_Processing.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ECommerceOrder_Processing.models.Item;
import com.ECommerceOrder_Processing.models.Order;
import com.ECommerceOrder_Processing.repositories.ItemRepository;
import com.ECommerceOrder_Processing.repositories.OrderRepository;
import com.ECommerceOrder_Processing.services.OrderService;
import com.ECommerce_order_processing.dto.OrderRequest;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {
	
	private final OrderService orderService;
	private final ItemRepository itemRepo;
	private final OrderRepository orderRepository;
	
	@Autowired
	public OrderController(OrderService orderService, ItemRepository itemRepo, OrderRepository orderRepository) {
		this.orderService = orderService;
		this.itemRepo = itemRepo;
		this.orderRepository = orderRepository;
	}
	
	@GetMapping
	public List<Order> getOrder() {
		return orderService.getOrder();
	}
	
	@GetMapping(path = "{orderId}")
	public Order getOrderById(@PathVariable("orderId") Long orderId) {
		return orderService.getOrderById(orderId);
	}
	
	@PostMapping("/createOrder")
	public Order createOrder(@RequestBody OrderRequest orderRequest) {
		Order order = orderRequest.getOrder();
		List<Item> itemList = order.getItemList();
		// System.out.println("Item List:" + itemList);
		double orderSubTotal = 0;
		
		for(Item i: itemList) {
			double orderTotal = i.getItem_price() * i.getItem_quantity();
			double orderTax = orderTotal * 0.05;
			i.setOrder_tax(orderTax);
			i.setOrder_total(orderTotal);
			orderSubTotal += orderTax + orderTotal;
		}
		
		order.setOrderSubTotal(orderSubTotal);
		order.setShippingCharge(orderSubTotal * 0.07);
		System.out.println(order.getCustomer().toString());
		
		System.out.println(order.getPayment().getPaymentId());
		System.out.println(order.getPayment().toString());
//		System.out.println(order.getBillingAddress().getBillingId());
//		System.out.println(order.getBillingAddress().toString());
		return orderRepository.save(orderRequest.getOrder());
		
//		long order_id = order.getOrderId();
//		System.out.println(order_id);
//		
//		Order o = this.getOrderById(order_id);
//		System.out.println(o.toString());
//		
//		itemRepo.save(new Item("Eggs", 10, 5));
//		itemRepo.save(new Item("Milk", 10, 5));
	}
	
	@DeleteMapping(path = "/delete/{orderId}")
	public void deleteOrder(@PathVariable("orderId") Long orderId) {
		orderService.deleteOrderById(orderId);
	}
}
