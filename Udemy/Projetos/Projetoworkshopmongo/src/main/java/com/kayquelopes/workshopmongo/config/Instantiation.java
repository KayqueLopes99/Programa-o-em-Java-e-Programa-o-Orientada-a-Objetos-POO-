package com.kayquelopes.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.kayquelopes.workshopmongo.domain.Post;
import com.kayquelopes.workshopmongo.domain.User;
import com.kayquelopes.workshopmongo.dto.AuthorDTO;
import com.kayquelopes.workshopmongo.dto.CommentDTO;
import com.kayquelopes.workshopmongo.repository.UserRepository;
import com.kayquelopes.workshopmongo.repository.PostRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        postRepository.deleteAll();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, sdf.parse("28/01/2026"), "Partiu vida!", "Vou viajar!", new AuthorDTO(maria));
        postRepository.saveAll(Arrays.asList(post1));

        CommentDTO c1 = new CommentDTO(
                "Boa viagem mano!",
                sdf.parse("21/03/2018"),
                new AuthorDTO(alex));

        CommentDTO c2 = new CommentDTO(
                "Aproveite!",
                sdf.parse("22/03/2018"),
                new AuthorDTO(bob));

        post1.getComments().addAll(Arrays.asList(c1, c2));
        postRepository.save(post1);
        maria.getPosts().addAll(Arrays.asList(post1));
        userRepository.save(maria);

    }
}
