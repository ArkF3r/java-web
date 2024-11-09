package com.course.educacionit.soapclient.impl;

import com.course.educacionit.dto.ProductDTO;
import com.course.educacionit.soapclient.SoapClient;
import com.example.soap.client.ProductWsSoapService;
import com.example.soap.client.ProductWsSoapServiceImplService;
import com.example.soap.client.WsProductDTO;

public class SoapClientCXFImpl implements SoapClient {

	@Override
	public ProductDTO getProductById(Long id) {
		System.out.println("Get product from SOAP Server");
		ProductWsSoapServiceImplService _service = new ProductWsSoapServiceImplService();
		ProductWsSoapService service = _service.getProductWsSoapServiceImplPort();
		WsProductDTO dto = service.getProductById(id);
		return new ProductDTO(dto.getId(), dto.getName(), dto.getPrice());
	}

}
