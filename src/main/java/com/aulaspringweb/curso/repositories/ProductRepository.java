package com.aulaspringweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringweb.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
