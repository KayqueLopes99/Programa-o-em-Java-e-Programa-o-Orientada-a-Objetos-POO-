package com.kayquelopes.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CommentDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String text;
    private Date date;
    private AuthorDTO author;

    public CommentDTO(String text, Date date, AuthorDTO author) {
        this.text = text;
        this.date = date;
        this.author = author;
    }

}
