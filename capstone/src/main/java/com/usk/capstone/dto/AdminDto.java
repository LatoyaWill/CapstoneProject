package com.usk.capstone.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AdminDto {

	private String password;
	
	private String username;
	
		
	
		public String getPassword() {
			
			return password;
		}
		
		public void setFirstName(String password) {
			
			this.password = password;
		}
		
		public String getUsername() {
			
			return username;
		}
		
		public void setUsername(String username) {
			
			this.username = username;
		}
	
	
}
