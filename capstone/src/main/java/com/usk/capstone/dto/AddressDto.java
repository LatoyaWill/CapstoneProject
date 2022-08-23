package com.usk.capstone.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDto {

	private int id;
	
	private String address1;
	
	private String address2;
	
	private String city;
	
	private String state;
	
	private String zipcode;
	
	private int user_id;

	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
*/
	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/*public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}*/
}
