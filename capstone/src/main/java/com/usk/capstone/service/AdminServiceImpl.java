package com.usk.capstone.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usk.capstone.dto.AdminDto;
import com.usk.capstone.entity.User;
import com.usk.capstone.repository.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminRepo adminRepo;
	
	@Override
	public List<User> getAllUsers() {
	
		return adminRepo.findAll();
	}
	
	@Override
	public void deleteUser(Long userId) {
	
		adminRepo.deleteById(userId);
	}

	@Override
	public User AdminLogin(AdminDto adminDto) {
		// TODO Auto-generated method stub
		return null;
	}





}
