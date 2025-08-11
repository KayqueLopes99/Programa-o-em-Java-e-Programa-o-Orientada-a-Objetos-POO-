package Udemy.Code.Lista_Matriz.ListOfEmployees;

public class Employees {
    private int id;
    private String name;
    private double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            this.salary += this.salary * (percentage / 100);
        } else {
            System.out.println("Invalid percentage.");
        }
    }

    @Override
    public String toString() {
        return this.id + ", " + this.name + ", " + this.salary;
    }
}
