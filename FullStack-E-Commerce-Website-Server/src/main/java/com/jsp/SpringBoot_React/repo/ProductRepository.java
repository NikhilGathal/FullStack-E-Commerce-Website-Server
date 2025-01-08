package com.jsp.SpringBoot_React.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.SpringBoot_React.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {}