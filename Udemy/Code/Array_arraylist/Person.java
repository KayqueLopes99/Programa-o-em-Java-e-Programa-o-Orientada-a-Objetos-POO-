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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.height = 0.0;
    }


    public double getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "[Pessoa] Name: " + name + ", Age: " + age + ", Height: " + height;
    }

}
