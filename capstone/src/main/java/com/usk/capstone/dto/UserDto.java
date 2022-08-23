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
	
	@NotNull
	@Size(min = 10, message = "username must be 10 or more characters")
	private String username;
	
	@NotNull(message = "Password required, please enter password and try again")
	@Size(min = 10, message = "password must be 10 or more characters")
	private String password;

	private Boolean emailVerified;

	
	
	
	public String getFirstName() {
		
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}
	

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUsername() {
		
		return username;
	}
	
	public void setUsername(String username) {
		
		this.username = username;
	}
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean isEmailVerified() {
		return emailVerified;
	}
		
	public void setEmailVerified(boolean emailVerified) {
		this.emailVerified = emailVerified;
	}
	
}
