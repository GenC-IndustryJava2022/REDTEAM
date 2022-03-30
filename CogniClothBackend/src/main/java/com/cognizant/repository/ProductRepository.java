package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entityclasses.Product;


public interface ProductRepository extends JpaRepository <Product, String>{

}
