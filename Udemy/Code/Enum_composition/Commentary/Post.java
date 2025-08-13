package Udemy.Code.Enum_composition.Commentary;

import java.time.LocalDateTime;
import java.util.List;


import java.util.ArrayList;

public class Post {
    private LocalDateTime moment;
    private String title;
    private String content;
    private int likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(LocalDateTime moment, String title, String content, Integer likes) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.likes = likes;

    }

    public void addComment(Comment comment) {
        comments.add(comment);
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public void postage() {
        StringBuilder postComment = new StringBuilder(
                "======================================\nComentários:\n");
        for (Comment c : comments) {
            postComment.append(c.getText()).append("\n");
        }

        System.out.println("Título: " + title);
        System.out.println("Momento: " + moment);
        System.out.println("Conteúdo: " + content);
        System.out.println("Likes: " + likes);
        System.out.print(postComment.toString());
    }
}
