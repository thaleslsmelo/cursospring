package com.aulaspringweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringweb.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
