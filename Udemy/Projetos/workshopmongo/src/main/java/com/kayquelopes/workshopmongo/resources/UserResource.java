package com.kayquelopes.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayquelopes.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User user = new User(1L, "Kayque", "Kayque@gmail.com");
        List<User> listUsers = new ArrayList<>();
        listUsers.addAll(Arrays.asList(user));

        return ResponseEntity.ok().body(listUsers);

    }
}
