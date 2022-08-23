package com.usk.capstone.service;

import com.usk.capstone.dto.LoginDto;
import com.usk.capstone.dto.UserDto;
import com.usk.capstone.entity.User;

public interface UserService {
	
	User registerUser(UserDto userDto);

	User login(LoginDto loginDto);
	
	

}
