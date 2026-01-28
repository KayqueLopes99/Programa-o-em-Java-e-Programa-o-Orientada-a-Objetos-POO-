package com.kayquelopes.workshopmongo.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.kayquelopes.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTitleContainingIgnoreCase(String text);

    @Query("{ 'title': { $regex: ?0, $options: 'i' } }")
    List<Post> searchTitle(String text);


    // Lógica da Query:
    // 1. ($and) O post deve estar DENTRO do prazo: data maior que a inicial (?1) E menor que a final (?2).
    // 2. ($or)  E o texto procurado (?0) deve existir no Título OU no Corpo OU nos Comentários.
    // OBS: 'regex' busca partes do texto e 'options: i' ignora maiúsculas/minúsculas.

    // ?1 indice do paramentro do método
    @Query("{ $and: [ { date: {$gte: ?1} }, { date: { $lte: ?2} } , { $or: [ { 'title': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } } ] } ] }") 
    List<Post> fullSearch(String text, Date minDate, Date maxDate);

}
