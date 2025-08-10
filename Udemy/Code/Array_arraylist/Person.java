package Udemy.Code.Array_arraylist;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "[Pessoa] Name: " + name + ", Age: " + age + ", Height: " + height;
    }

}
