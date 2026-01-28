package com.kayquelopes.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import com.kayquelopes.workshopmongo.dto.AuthorDTO;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "posts") // new annotation
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Post implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    private String id;
    private Date date;
    private String title;
    private String body;
    private AuthorDTO auther;

    
    public Post(String id, Date date, String title, String body, AuthorDTO auther) {
    this.id = id;
    this.date = date;
    this.title = title;
    this.body = body;
    this.auther = auther;
}


   
}
