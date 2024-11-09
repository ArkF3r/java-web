package com.course.educacionit.websoap.main;

import com.course.educacionit.websoap.impl.ProductWsSoapServiceImpl;

import jakarta.xml.ws.Endpoint;

public class ProductWSSoapMain {
	public static void main(String[] args) {
		System.out.println("Publicando Servicio Web de producto...");

		Endpoint.publish("http://localhost:8000/", new ProductWsSoapServiceImpl());
		
		System.out.println("Servicio Web de producto iniciado en http://localhost:8000/");
		
		System.out.println("La direccion del wsdl es: http://localhost:8000/?wsdl");
	}

}
