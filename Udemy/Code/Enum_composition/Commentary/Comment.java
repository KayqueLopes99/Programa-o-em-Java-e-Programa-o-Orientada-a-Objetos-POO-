package Udemy.Code.Enum_composition.Commentary;

public class Comment {
    private String text;

    
    public Comment(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void postage() {
        System.out.println("Comentário: " + text);
    }
}
