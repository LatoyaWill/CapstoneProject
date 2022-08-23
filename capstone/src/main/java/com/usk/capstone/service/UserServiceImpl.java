package com.usk.capstone.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usk.capstone.dto.LoginDto;
import com.usk.capstone.dto.UserDto;
import com.usk.capstone.entity.User;
import com.usk.capstone.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired 
	UserRepository userRepository;
	
	@Override
	public User registerUser(UserDto userDto ) {
		
		User user = new User();
		
		BeanUtils.copyProperties(userDto, user);
		
		return userRepository.save(user);
	}

	@Override
	public User login(LoginDto loginDto) {
		// TODO Auto-generated method stub
		return null;
	}
}
