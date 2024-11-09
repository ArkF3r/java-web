package com.course.educacionit.controller;

import java.io.IOException;

import com.course.educacionit.dto.ProductDTO;
import com.course.educacionit.soapclient.SoapClient;
import com.course.educacionit.soapclient.impl.SoapClientCXFImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ws/product")
public class ProductControllerSoap extends HttpServlet  {
	
	private SoapClient soapClient;
	
	public ProductControllerSoap() {
		this.soapClient = new SoapClientCXFImpl();
	}
	
	@Override
	protected void doGet(
			HttpServletRequest req, 
			HttpServletResponse resp
	) throws ServletException, IOException {
		// This method look for a product by its ID
		//Get ID parameter from request
		String idProductStr = req.getParameter("id");
		Long idProduct = Long.parseLong(idProductStr);
		ProductDTO product = soapClient.getProductById(idProduct);
		resp.getWriter().print(product.toString());
		//Save product into session request
		req.getSession().setAttribute("sessionProduct", product);
		//redirect
		getServletContext().getRequestDispatcher("/productData.jsp").forward(req, resp);
	}
}
