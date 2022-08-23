package com.usk.capstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="address")
@Getter
@Setter
public class Address {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "address1")
	private String address1;
	
	@Column(name = "address2")
	private String address2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "zipcode")
	private String zipcode;
	
	@Column(name = "user_id")
	private int user_id;
	
	/*public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}*/
	
	public String getAddress1() {
		return address1;
	}
	
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	public String getAddress2() {
		return address1;
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
	
	/*public int getUser_Id() {
		return user_id;
	}
	
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}*/
}
