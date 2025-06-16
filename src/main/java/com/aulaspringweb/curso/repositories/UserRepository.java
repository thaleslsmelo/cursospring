package com.aulaspringweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspringweb.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
