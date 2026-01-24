package com.educandoweb.course.Repositories;

import com.educandoweb.course.Entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}