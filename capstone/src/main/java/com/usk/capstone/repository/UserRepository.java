package com.usk.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usk.capstone.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{


}
