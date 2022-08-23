package com.usk.capstone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usk.capstone.dto.AddressDto;
import com.usk.capstone.entity.Address;
import com.usk.capstone.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@PostMapping("/checkout")
	public Address userCheckout(@RequestBody AddressDto addressDto) {
		return addressService.userCheckout(addressDto);
	}
}
