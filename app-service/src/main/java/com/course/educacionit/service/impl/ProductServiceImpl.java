package com.course.educacionit.service.impl;

import com.course.educacionit.dto.ProductDTO;
import com.course.educacionit.repository.ProductRepository;
import com.course.educacionit.repository.impl.ProductRepositoryMySQLImpl;
import com.course.educacionit.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	public ProductServiceImpl() {
		this.productRepository = new ProductRepositoryMySQLImpl();
	}



	@Override
	public ProductDTO getById(Long id) {
		return this.productRepository.getById(id);
	}

}
