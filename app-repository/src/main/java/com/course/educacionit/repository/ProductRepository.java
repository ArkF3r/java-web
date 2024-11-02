package com.course.educacionit.repository;

import com.course.educacionit.dto.ProductDTO;

public interface ProductRepository {
	void save(ProductDTO entity);
	ProductDTO getById(Long id);
	ProductDTO updateById(ProductDTO entity);
	ProductDTO deleteById(Long id);
}
