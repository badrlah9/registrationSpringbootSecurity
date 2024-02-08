package com.example.registrationlogindemo.repository;

import com.example.registrationlogindemo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
