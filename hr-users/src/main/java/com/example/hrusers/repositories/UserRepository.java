package com.example.hrusers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrusers.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
