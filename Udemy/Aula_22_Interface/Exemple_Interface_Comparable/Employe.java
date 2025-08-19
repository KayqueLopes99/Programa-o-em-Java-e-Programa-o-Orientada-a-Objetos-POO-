package Udemy.Aula_22_Interface.Exemple_Interface_Comparable;

public class Employe implements Comparable<Employe> {
    private String name;
    private double salary;
    public Employe(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employe [name=" + name + ", salary=" + salary + "]";
    }
    @Override
    // Comparar por nome
    public int compareTo(Employe otherEmploye) {
        return name.compareTo(otherEmploye.getName());
    }

    

    
}
