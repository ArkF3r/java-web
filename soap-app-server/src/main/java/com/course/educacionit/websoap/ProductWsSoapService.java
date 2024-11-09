package com.course.educacionit.websoap;

import com.course.educacionit.websoap.dto.WSProductDTO;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface ProductWsSoapService {

	//Each method from here is an endpoint of our server 
	@WebMethod
	public WSProductDTO getProductById(Long id);  
}
