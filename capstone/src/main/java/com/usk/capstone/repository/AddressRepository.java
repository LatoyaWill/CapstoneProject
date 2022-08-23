package com.usk.capstone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usk.capstone.entity.Address;

public interface AddressRepository extends JpaRepository<Address, String> {

}
