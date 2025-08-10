package Udemy.Code.Classes;

public class Student {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }

    public void checkingAproved() {
        double average = this.grade1 + this.grade2 + this.grade3;
        if (average >= 60) {
            System.out.println("PASS! Final grade: " + average);
        } else {
            System.out.println("FAILED! Final grade: " + average);
            System.out.println("Missing " + (60 - average) + " points");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade1=" + grade1 +
                ", grade2=" + grade2 +
                ", grade3=" + grade3 +
                '}';
    }

}
