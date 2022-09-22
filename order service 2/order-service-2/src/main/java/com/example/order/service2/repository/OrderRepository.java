package com.example.order.service2.repository;

import com.example.order.service2.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByOrderId(Long orderId);
}

