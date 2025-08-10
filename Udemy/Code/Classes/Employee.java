package Udemy.Code.Classes;

public class Employee  {
    private String name;
    private double salary;
    private double tax;

    public Employee(String name, double salary, double tax) {
        this.name = name;
        this.salary = salary;
        this.tax = tax;
    }

    public double calculateNetSalary() {
        return salary - tax;
    }

    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        } else {
            System.out.println("Invalid percentage.");
        }
    }


@Override
public String toString() {
    return "Funcionario [" +
            "nome: " + this.name +
            ", salarioLiquido: " + calculateNetSalary() +
            ']';
}
}
