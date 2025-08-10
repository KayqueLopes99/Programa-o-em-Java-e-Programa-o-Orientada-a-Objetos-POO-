package Udemy.Code.Array_arraylist;

public class Student {
    private String name;
    private double grade1;
    private double grade2;

    public Student(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public boolean checkingAproved() {
        double average = this.grade1 + this.grade2;
        return (average >= 6.0);

    }

    public String getName() {
        return name;
    }
}

