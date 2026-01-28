package com.kayquelopes.workshopmongo.dto;
import java.io.Serializable;

import com.kayquelopes.workshopmongo.domain.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String id;
    private String name;

    public AuthorDTO(User obj){
        id = obj.getId();
        name = obj.getName();
    }
    
}

