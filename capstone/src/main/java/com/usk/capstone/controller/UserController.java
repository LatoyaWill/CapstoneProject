package com.usk.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usk.capstone.dto.UserDto;
import com.usk.capstone.entity.User;
import com.usk.capstone.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@GetMapping("/login")
	public User getUser(@RequestParam String userName, @RequestParam String password) {
		return userService.getUserByName(userName, password);
	}
	
	@PostMapping("/register")
	public User registerUser(@RequestBody UserDto userDto) {
		return userService.registerUser(userDto);
	}
	
	@DeleteMapping("/delete/{userId}") 
	public String deleteUser(@PathVariable Long userId) {
		userService.deleteUser(userId);
		return "Success";
	}
	
}
