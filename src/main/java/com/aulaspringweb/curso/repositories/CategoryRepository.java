package com.aulaspringweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringweb.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
