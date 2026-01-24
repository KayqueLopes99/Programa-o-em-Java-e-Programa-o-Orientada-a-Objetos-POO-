package com.educandoweb.course.config;

import java.time.Instant;
import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import com.educandoweb.course.Entities.User;
import com.educandoweb.course.Entities.enums.OrderStatus;
import com.educandoweb.course.Repositories.UserRepository;
import com.educandoweb.course.Repositories.CategoryRepository;
import com.educandoweb.course.Repositories.OrderRepository;
import com.educandoweb.course.Entities.Order;
import com.educandoweb.course.Entities.Category;


@Configuration
public class SeedingConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");


        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456", null);
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456", null);

        Order o1 = new Order(null, Instant.parse("2025-06-20T19:53:07Z"), OrderStatus.WAITING_PAYMENT, u1);
        Order o2 = new Order(null, Instant.parse("2025-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2025-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        

        System.out.println("Usuários salvos no PostgreSQL com sucesso!");
    }
}