package com.educandoweb.course.Repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.Entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
 
} 
