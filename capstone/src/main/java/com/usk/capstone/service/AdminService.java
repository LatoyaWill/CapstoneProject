package com.usk.capstone.service;

import java.util.List;

import com.usk.capstone.dto.AdminDto;
import com.usk.capstone.entity.User;

public interface AdminService {

	void deleteUser(Long userId);

	List<User> getAllUsers();

	User AdminLogin(AdminDto adminDto);

}
