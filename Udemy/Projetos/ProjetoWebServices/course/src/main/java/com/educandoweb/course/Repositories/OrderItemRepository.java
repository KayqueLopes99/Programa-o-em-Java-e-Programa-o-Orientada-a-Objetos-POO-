package com.educandoweb.course.Repositories;
import com.educandoweb.course.Entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
