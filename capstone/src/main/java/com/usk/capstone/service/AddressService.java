package com.usk.capstone.service;

import com.usk.capstone.dto.AddressDto;
import com.usk.capstone.entity.Address;

public interface AddressService {

	Address userCheckout(AddressDto addressDto);
}


