package com.kayquelopes.workshopmongo.domain;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// @Entity
// @Table(name = "tb_user")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    
    @EqualsAndHashCode.Include
    private Long id;
    private String name;
    private String email;

    // @JsonIgnore
    // @Setter(AccessLevel.NONE) // Não permitir que a lista seja modificada
    // diretamente
    // @OneToMany(mappedBy = "client")

    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
