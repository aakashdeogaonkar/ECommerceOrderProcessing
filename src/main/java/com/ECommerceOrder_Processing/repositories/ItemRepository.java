package com.ECommerceOrder_Processing.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ECommerceOrder_Processing.models.Item;
import com.ECommerceOrder_Processing.models.Order;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
