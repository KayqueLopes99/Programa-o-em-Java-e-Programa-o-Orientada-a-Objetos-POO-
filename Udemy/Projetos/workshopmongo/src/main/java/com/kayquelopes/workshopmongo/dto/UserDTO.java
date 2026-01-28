package com.kayquelopes.workshopmongo.dto;

import java.io.Serializable;

import com.kayquelopes.workshopmongo.domain.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;
    private String email;

    public UserDTO(User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
    }
}

