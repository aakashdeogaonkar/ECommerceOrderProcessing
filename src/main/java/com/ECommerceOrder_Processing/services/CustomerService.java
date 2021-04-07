package com.ECommerceOrder_Processing.services;

import java.util.Optional;
import java.util.regex.Pattern;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ECommerceOrder_Processing.models.Customer;
import com.ECommerceOrder_Processing.repositories.CustomerRepo;
import com.ECommerce_order_processing.exception.OrderProcessingException;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepo customerRepository;

	public void addNewCustomer(Customer customer) {
		Optional<Customer> customerByEmail = customerRepository.findCustomerByEmail(customer.getEmail());
		
		if(customerByEmail.isPresent())
			throw new OrderProcessingException("Email already in use");
		
		customerRepository.save(customer);
	}
	
	
	
//	public Customer registerCustomer(String name, String email) throws OrderProcessingException{
//		
//		Pattern pattern = Pattern.compile("^(.+)@(.+)$");
//		if(email != null)
//			email = email.toLowerCase();
//		
//		if(!pattern.matcher(email).matches())
//			throw new OrderProcessingException("Invalid email format");
//		
//		Integer count = customerRepository.getCountByEmail(email);
//		System.out.println("Count: " + count);
//		if(count > 0)
//			throw new OrderProcessingException("Email already in use");
//		
//		Long customerId = customerRepository.create(name, email);
//		System.out.println("Customer Id: " + customerId);
//		return customerRepository.findByCustomerId(customerId);
//	}
}
