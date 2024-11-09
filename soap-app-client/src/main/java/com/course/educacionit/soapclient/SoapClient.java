package com.course.educacionit.soapclient;

import com.course.educacionit.dto.ProductDTO;

public interface SoapClient {
	ProductDTO getProductById(Long id);
}
