package com.aulaspringweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringweb.curso.entities.OrderItem;
import com.aulaspringweb.curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
