package com.course.educacionit.websoap.dto;

import java.io.Serializable;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ProductDTO")
@XmlAccessorType(XmlAccessType.FIELD)
public class WSProductDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    public WSProductDTO() {
		// TODO Auto-generated constructor stub
	}
    public WSProductDTO(Long id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@XmlElement(name = "id")
    private Long id;

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "price")
    private Double price;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrecio(Double price) {
        this.price = price;
    }
}