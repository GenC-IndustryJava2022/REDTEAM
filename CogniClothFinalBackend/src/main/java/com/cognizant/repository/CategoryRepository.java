package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.entityclasses.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}