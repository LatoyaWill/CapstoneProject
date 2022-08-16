package com.usk.capstone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usk.capstone.dto.UserDto;
import com.usk.capstone.entity.User;
import com.usk.capstone.repository.UserRepository;



@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User registerUser(UserDto userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		
		return userRepository.save(user);
	}

	@Override
	public User getUser(Long userId) {
		Optional<User> user = userRepository.findById(userId);
			if (user.isPresent()) {
				return user.get();
			}
		return null;
	}

	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
		
	}

	@Override
	public User getUserByName(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserbyFirstName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
