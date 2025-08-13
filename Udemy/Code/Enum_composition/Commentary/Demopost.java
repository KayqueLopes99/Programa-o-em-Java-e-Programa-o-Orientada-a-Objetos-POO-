package Udemy.Code.Enum_composition.Commentary;

import java.time.LocalDateTime;

public class Demopost {
    public static void main(String[] args) {
        Comment comment1 = new Comment("Have a nice trip.");
        Comment comment2 = new Comment("Wow that's awesome!");
        Comment comment3 = new Comment("Good night!");

        Post post1 = new Post(LocalDateTime.now(), "Traveling to United States!", "Visit local", 50);
        post1.addComment(comment1);
        post1.addComment(comment2);
        post1.addComment(comment3);

        post1.postage();



    }
}
