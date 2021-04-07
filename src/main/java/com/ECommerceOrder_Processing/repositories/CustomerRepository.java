//package com.ECommerceOrder_Processing.repositories;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.ECommerceOrder_Processing.models.Customer;
//
//@Repository
//public interface CustomerRepository extends JpaRepository<Customer, Long> {
//	
////	Long create(String firstName, String lastName, String email, String billingAddressLine1, String billingAddressLine2, String billingCity,
////			String billingState, String billingZip, String shippingAddressLine1, String shippingAddressLine2, String shippingCity, 
////			String shippingState, String shippingZip);
//
//	Customer findByEmail(String email);
//	
//	Integer getCountByEmail(String email);
//	
//	Customer findByCustomerId(Long customerId);
//
//	Long save(Long customerId);
//}
