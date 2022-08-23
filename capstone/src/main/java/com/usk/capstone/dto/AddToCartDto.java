package com.usk.capstone.dto;

import javax.validation.constraints.NotNull;

public class AddToCartDto {
 
	private int user_id;
	
	@NotNull
	private int productId;
	
	@NotNull
	private int count;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProduct_id(int productId) {
		this.productId = productId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
