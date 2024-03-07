package com.SpringBootWebMVC.repo.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBootWebMVC.model.Products;
@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

}
