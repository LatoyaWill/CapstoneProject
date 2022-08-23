package com.usk.capstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usk.capstone.dto.AdminDto;
import com.usk.capstone.entity.User;
import com.usk.capstone.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@PostMapping("/AdminLogin")
	public User login(@RequestBody AdminDto adminDto) {
		return adminService.AdminLogin(adminDto);
	}

	@GetMapping("/allUser")
	public List<User> getAllUsers(){
		
		return adminService.getAllUsers();
	}
	
	@DeleteMapping("/delete/{userId}") 
	public String deleteUser(@PathVariable Long userId) {
		adminService.deleteUser(userId);
		return "Success";
	}
	
	

}
