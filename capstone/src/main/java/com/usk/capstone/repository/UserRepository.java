package com.usk.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usk.capstone.entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{

	
}
