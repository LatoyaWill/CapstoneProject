package com.usk.capstone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usk.capstone.dto.AddToCartDto;
import com.usk.capstone.entity.Products;
import com.usk.capstone.entity.User;

@Service
public class CartService {
	
	@Autowired
	ProductService productService;

	public void addToCart(AddToCartDto addToCartDto, User user) {
		// is item Id valid
		Products products = productService.findById(addToCartDto.getProductId());
		
		//save the cart
		
	}

}
