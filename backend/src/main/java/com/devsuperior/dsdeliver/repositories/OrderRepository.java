package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.etities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
