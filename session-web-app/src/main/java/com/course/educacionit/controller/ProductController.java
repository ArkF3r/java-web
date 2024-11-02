package com.course.educacionit.controller;

import java.io.IOException;

import com.course.educacionit.dto.ProductDTO;
import com.course.educacionit.service.ProductService;
import com.course.educacionit.service.impl.ProductServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/product")
public class ProductController extends HttpServlet  {
	
	private ProductService productService;
	
	public ProductController() {
		this.productService = new ProductServiceImpl();
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
		ProductDTO product = productService.getById(idProduct);
		resp.getWriter().print(product.toString());
		//Save product into session request
		req.getSession().setAttribute("sessionProduct", product);
		//redirect
		getServletContext().getRequestDispatcher("/productData.jsp").forward(req, resp);
	}
}
