package com.usk.capstone.service;

import com.usk.capstone.dto.UserDto;
import com.usk.capstone.entity.User;

public interface UserService {

	public User registerUser(UserDto userDto);

	public User getUser(Long userId);

	public void deleteUser(Long userId);

	public User getUserByName(String userName, String password);
}

