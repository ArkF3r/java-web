package com.course.educacionit.websoap.impl;

import com.course.educacionit.dto.ProductDTO;
import com.course.educacionit.service.ProductService;
import com.course.educacionit.service.impl.ProductServiceImpl;
import com.course.educacionit.websoap.dto.WSProductDTO;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.course.educacionit.websoap.ProductWsSoapService")
public class ProductWsSoapServiceImpl {
	public WSProductDTO getProductById(Long id) {		
		ProductService service = new ProductServiceImpl();
		ProductDTO dto = service.getById(id);
		return new WSProductDTO(dto.getId(), dto.getName(), dto.getPrice());
	}
}
