package com.educandoweb.course.Repositories;
import com.educandoweb.course.Entities.Category;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
 
} 