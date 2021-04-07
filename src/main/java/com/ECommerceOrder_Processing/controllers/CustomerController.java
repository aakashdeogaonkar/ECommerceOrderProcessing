package com.ECommerceOrder_Processing.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ECommerceOrder_Processing.models.Customer;
import com.ECommerceOrder_Processing.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/create")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addNewCustomer(customer);
	}
	
//	@PostMapping("/create")
//	public ResponseEntity<Map<String, String>> createCustomer(@RequestBody Map<String, Object> userMap) {
//		String name = (String) userMap.get("name");
//		String email = (String) userMap.get("email");
////		String billingAddressLine1 = (String) userMap.get("billingAddressLine1");
////		String billingAddressLine2 = (String) userMap.get("billingAddressLine2");
////		String billingCity = (String) userMap.get("billingCity");
////		String billingState = (String) userMap.get("billingState");
////		String billingZip = (String) userMap.get("billingZip");
////		String shippingAddressLine1 = (String) userMap.get("shippingAddressLine1");
////		String shippingAddressLine2 = (String) userMap.get("shippingAddressLine2");
////		String shippingCity = (String) userMap.get("shippingCity");
////		String shippingState = (String) userMap.get("shippingState");
////		String shippingZip = (String) userMap.get("shippingZip");
//		
//		Customer customer = customerService.registerCustomer(name, email);
//		Map<String, String> map = new HashMap<>();
//		
//		map.put("message", "registered successfully");
//		return new ResponseEntity<>(map, HttpStatus.OK);
//	}
	
	
}
