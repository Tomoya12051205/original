package com.example.original.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.original.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);
}
