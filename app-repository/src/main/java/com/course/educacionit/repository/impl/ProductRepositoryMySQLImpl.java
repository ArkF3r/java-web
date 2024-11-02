package com.course.educacionit.repository.impl;

import java.util.Random;

import com.course.educacionit.dto.ProductDTO;
import com.course.educacionit.repository.ProductRepository;

public class ProductRepositoryMySQLImpl implements ProductRepository {
	
	private Random randomGenerator = new Random();

	@Override
	public void save(ProductDTO entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public ProductDTO getById(Long id) {
		String sql = "SELECT * FROM producto where id="+id;
		System.out.println(sql);
		return generateProduct(id);
	}

	@Override
	public ProductDTO updateById(ProductDTO entity) {
		return entity;

	}

	@Override
	public ProductDTO deleteById(Long id) {
		// TODO Auto-generated method stub
		return generateProduct(id);
	}
	
	private ProductDTO generateProduct(Long id) {
		return new ProductDTO(id, "Product "+id, (Math.abs(randomGenerator.nextDouble() * randomGenerator.nextInt())));
	}

}
