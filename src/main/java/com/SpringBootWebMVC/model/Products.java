package com.SpringBootWebMVC.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name = "products")
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String brand;
	private String category;
	private Double price;
	
	@Column(columnDefinition = "TEXT")
	private String discription;
	private Date createdAt;
	private String imageFileName; 
	
}
