package com.usk.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usk.capstone.dto.LoginDto;
import com.usk.capstone.dto.UserDto;
import com.usk.capstone.entity.User;
import com.usk.capstone.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public User registerUser(@RequestBody UserDto userDto) {
		return userService.registerUser(userDto);
	}
	
	@PostMapping("/login")
	public User login(@RequestBody LoginDto loginDto) {
		return userService.login(loginDto);
	}

}
