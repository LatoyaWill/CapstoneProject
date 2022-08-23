package com.usk.capstone.repository;

import com.usk.capstone.entity.Products;

public interface ProductRepository {

	Products findByName(String name);
}
