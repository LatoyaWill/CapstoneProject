package com.usk.capstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="cart_items")
@Getter
@Setter
public class Cart {

	@Column(name = "count")
	private int count;
	
	@ManyToOne
	@Column(name = "product_id")
	private int product_id;
	
	@ManyToOne
	@Column(name = "user_id")
	private int user_id;
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
