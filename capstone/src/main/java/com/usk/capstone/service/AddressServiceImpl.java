package com.usk.capstone.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usk.capstone.dto.AddressDto;
import com.usk.capstone.entity.Address;
import com.usk.capstone.repository.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	AddressRepository addressRepository;

	@Override
	public Address userCheckout(AddressDto addressDto) {
		 
			Address address = new Address();
			
			BeanUtils.copyProperties(addressDto, address);
			
			return addressRepository.save(address);
	}
}


