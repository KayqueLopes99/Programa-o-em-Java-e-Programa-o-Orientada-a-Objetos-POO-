package Udemy.Code.Array_arraylist.fixação;

public class StudentRent {
    private String name;
    private String email;

    public StudentRent(String name, String email) {
        this.name = name;
        this.email = email;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public String toString() {
        return this.name + ", " + this.email;
    }
}
