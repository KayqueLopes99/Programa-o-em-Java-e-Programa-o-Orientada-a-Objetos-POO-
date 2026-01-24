package com.educandoweb.course.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.educandoweb.course.Entities.User;


@RestController
@RequestMapping(value="/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Kaio", "kaio.@gmail.com", "123456789", "12345");
        
        return ResponseEntity.ok().body(user);
    }
}
