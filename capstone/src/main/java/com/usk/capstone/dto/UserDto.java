package com.usk.capstone.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class UserDto {
	
	@NotNull(message = "Please enter value for First Name")
	private String firstName;
	
	@NotNull(message = "Please enter value for Last Name")
	private String lastName;
	
	@Email
	@NotNull(message = "Email is required")
	private String email;
	
	@Size(min = 10, message = "username must be 10 or more characters")
	private String username;
	
	@NotNull(message = "Password required, please enter password and try again")
	@Size(min = 10, message = "password must be 10 or more characters")
	private String password;

	private Boolean emailVerified;
}
