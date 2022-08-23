package com.usk.capstone.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usk.capstone.entity.Products;
import com.usk.capstone.exception.ProductNotFoundException;
import com.usk.capstone.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Products saveProduct(Products products) {
		return productRepository.save(products);
	}
	
	public List<Products> saveProducts(List<Products> products) {
		return productRepository.saveAll(products);
	}
	
	public List<Products> getProducts() {
		return productRepository.findAll();
	}
	
	public Products getProductById(int id) {
		return productRepository.findById(id).orElse(null);
	}
	
	public String deleteProduct(int id) {
		productRepository.deleteById(id);
		return "product removed !" +id;
	}

	public Products findById(int product_id) throws ProductNotFoundException {
		
		Optional <Products> optionalProduct = ProductRepository.findById(productId);
			if(optionalProduct.isEmpty()) {
				throw new ProductNotFoundException("Product id isn't valid");
			}
			return optionalProduct.get
	}
	
}
