package com.ECommerceOrder_Processing.repositories;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.ECommerceOrder_Processing.models.Customer;
import com.ECommerce_order_processing.exception.OrderProcessingException;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>{
	
	Optional<Customer> findCustomerByEmail(String email);
	
//	private static final String SQL_CREATE = "INSERT INTO customers(cid, name, email) VALUES (NEXTVAL('CUSTOMERS_SEQ'), ?, ?)";
//	
//	private static final String SQL_COUNT_BY_EMAIL = "SELECT COUNT(*) FROM CUSTOMERS WHERE email = ?";
//	
//	private static final String SQL_FIND_BY_ID = "SELECT cid, name, email FROM CUSTOMERS WHERE cid = ?";
//	
//	@Autowired
//	JdbcTemplate jdbcTemplate;
//	
//	public Long create(String name, String email) throws OrderProcessingException {
//		try {
//			KeyHolder keyHolder = new GeneratedKeyHolder();
//			jdbcTemplate.update(connection -> {
//				System.out.println("Inside JDBC Template");
//				PreparedStatement ps = connection.prepareStatement(SQL_CREATE, Statement.RETURN_GENERATED_KEYS);
//				System.out.println(SQL_CREATE);
//				System.out.println("Inside SQL_CREATE");
//				ps.setString(1, name);
//				System.out.println(name);
//				ps.setString(2, email);
//				System.out.println(email);
//				System.out.println(ps.toString());
////				ps.setString(4, billingAddressLine1);
////				ps.setString(5, billingAddressLine2);
////				ps.setString(6, billingCity);
////				ps.setString(7, billingState);
////				ps.setString(8, billingZip);
////				ps.setString(9, shippingAddressLine1);
////				ps.setString(10, shippingAddressLine2);
////				ps.setString(11, shippingCity);
////				ps.setString(12, shippingState);
////				ps.setString(13, shippingZip);
//				return ps;
//			}, keyHolder);
//			System.out.println("In TRY");
//			return (Long) keyHolder.getKeys().get("cid");
//		} catch(Exception e) {
//			throw new OrderProcessingException("Invalid Details, Failed to Create Account");
//		}
//	}
//	
//	public Customer findByEmail(String email) throws OrderProcessingException {
//		return null;
//	}
//	
//	public Integer getCountByEmail(String email) {
//		return jdbcTemplate.queryForObject(SQL_COUNT_BY_EMAIL, new Object[] {email}, Integer.class);
//	}
//	
//	public Customer findByCustomerId(Long customerId) {
//		return jdbcTemplate.queryForObject(SQL_FIND_BY_ID, new Object[] {customerId}, userRowMapper);
//	}
//	
//	private RowMapper<Customer> userRowMapper = ((rs, rowNum) -> {
//		return new Customer(rs.getLong("cid"),
//				rs.getString("name"),
//				rs.getString("email"));
//	});
}
