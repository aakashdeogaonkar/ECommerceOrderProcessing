package com.ECommerceOrder_Processing.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ECommerceOrder_Processing.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
	Order findByOrderId(long orderId);
}
