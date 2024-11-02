package com.course.educacionit.dto;

/**
 * 
 */
public class ProductDTO {
	private Long id;
	private String name;
	private Double price;
	
	public ProductDTO(Long id, String name, Double price) {
		super();
		this.setId(id);
		this.name = name;
		this.price = price;
	}
	public void setId(Long id) {
		if(id == null || id<0) {
			throw new IllegalArgumentException();
		}
		this.id = id;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "{\"id\":" + id + ", \"name\":\"" + name + "\", \"price\":" + price + "}";
	}
	
	
	
}
