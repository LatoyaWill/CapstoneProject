package com.usk.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.usk.capstone.dto.AddToCartDto;
import com.usk.capstone.dto.ProductDto;
import com.usk.capstone.entity.User;
import com.usk.capstone.service.AuthenticationService;
import com.usk.capstone.service.CartService;

import io.swagger.v3.oas.annotations.responses.ApiResponse;

@RestController
@RequestMapping("/cart")
public class CartControlller {

	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private AuthenticationService authenticationService;
	
	@Autowired
	private ProductDto productDto;
	
	//post cart api
	
	public ResponseEntity<ApiResponse> addToCart(@RequestBody AddToCartDto addToCartDto, 
												@RequestParam("token") String token) {
		
		authenticationService.authenticate(token);
		
		User user = authenticationService.getUser(token);
		
		//add to cart
		
		cartService.addToCart(addToCartDto, user);
		
		return new ResponseEntity<>(new ApiResponse(success: true, message "Added to cart"), HttpStatus.Created);
	}
	
	//get cart items for user
	
	//delete cart items for user
}
